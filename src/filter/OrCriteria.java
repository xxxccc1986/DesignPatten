package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 多个自定义的过滤条件
 * @date 2022/10/8 0:20
 */
public class OrCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> first = new ArrayList<>();
        List<Person> second = new ArrayList<>();
        //调用自己的过滤方法获取满足条件的对象
        first = criteria.meetCriteria(list);
        second = otherCriteria.meetCriteria(list);

        for (Person person : second) {
            //合并两个集合中的数据
            if (!first.contains(person)){
                first.add(person);
            }
        }
        return first;
    }
}

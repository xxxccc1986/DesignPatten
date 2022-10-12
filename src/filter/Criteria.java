package filter;

import java.util.List;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 过滤器接口(标准接口)
 * @date 2022/10/7 23:53
 */
public interface Criteria {
    /**
     * Description : 指定过滤条件的方法
     * @date 2022/10/7
     * @param list 存储了多个对象的list集合
     **/
    List<Person>  meetCriteria(List<Person> list);
}

package filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 测试类
 * @date 2022/10/8 8:54
 */
public class FilterPatternDemo {
    public static void main(String[] args) {
        //构建list集合
        List<Person> list = new ArrayList<>();
        Person p1 = new Person("1", "male", "single");
        Person p2 = new Person("2","female","marital");
        Person p3 = new Person("3","male","single");
        Person p4 = new Person("4","female","marital");
        Person p5 = new Person("5","male","single");
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);


        //创建限制男性的过滤器对象
        // CriteriaMale criteriaMale = new CriteriaMale();
        // List<Person> males = criteriaMale.meetCriteria(list);
        // for (Person male : males) {
        //     System.out.println(male.toString());
        // }

        System.out.println("===================");

        //创建多个条件的过滤器对象
        OrCriteria orCriteria = new OrCriteria(new CriteriaFemale(), new CriteriaMarital());
        List<Person> list1 = orCriteria.meetCriteria(list);
        for (Person male : list1) {
            System.out.println(male.toString());
        }
    }
}

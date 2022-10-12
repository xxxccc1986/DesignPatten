package composite;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 测试类
 * @date 2022/10/8 17:56
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        //构建树形结构
        Employee ceo = new Employee("ceo", "ceo", 2000);
        Employee e1 = new Employee("e1", "test", 1500);
        Employee e2 = new Employee("e2", "dev", 1500);
        ceo.add(e1);
        ceo.add(e2);
        Employee e3 = new Employee("e3", "test-t1", 1000);
        Employee e4 = new Employee("e4", "test-t2", 1000);
        e1.add(e3);
        e1.add(e4);

        //输出结果
        System.out.println(ceo);
        for (Employee e : ceo.getSubordinate()) {
            System.out.println(e);
            if (e.getSubordinate().size() > 0){
                for (Employee t : e.getSubordinate()) {
                    System.out.println(t);
                }
            }
        }

    }
}

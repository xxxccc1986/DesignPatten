package nullobject;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 测试类
 * @date 2022/10/9 19:00
 */
public class NullObjectPatternDemo {
    public static void main(String[] args) {
        AbstractCustomer customer = CustomerFactory.getCustomer("jack");
        System.out.println(customer.getName());
    }
}

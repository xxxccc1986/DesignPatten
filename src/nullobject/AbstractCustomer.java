package nullobject;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 抽象类
 * @date 2022/10/9 18:47
 */
public abstract class AbstractCustomer {
    public String name;

    //判断是否为空值
    public abstract Boolean isNull();

    public String getName() {
        return name;
    }
}

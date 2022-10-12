package nullobject;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 实际有值的类
 * @date 2022/10/9 18:49
 */
public class RealCustomer extends AbstractCustomer{
    private String name;

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public Boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}

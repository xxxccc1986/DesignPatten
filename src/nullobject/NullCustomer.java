package nullobject;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 代替空指针的空对象
 * @date 2022/10/9 18:50
 */
public class NullCustomer extends AbstractCustomer{
    private String name;

    public NullCustomer(String name) {
        this.name = name;
    }

    @Override
    public Boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "没有定义当前对象" + name;
    }
}

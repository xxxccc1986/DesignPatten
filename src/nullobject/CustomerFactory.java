package nullobject;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 创建AbstractCustomer的辅助类
 * @date 2022/10/9 18:51
 */
public class CustomerFactory {
    private static final String[] names = {"tom","jack","mark"};

    /**
     * Description :根据用户传递的名称判断当前是否存在此用户
     * @date 2022/10/9
     * @param name 用户传入的名字
     **/
    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){ //表示存在，返回真实对象
                return new RealCustomer(name);
            }
        }
        //不存在，返回指定的空对象
        return new NullCustomer(name);
    }
}

package singleton;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 单例模式之登记式(静态内部类)
 * 1、在单例类中声明一个静态内部类
 * 2、在静态内部类中声明单例对象并初始化这个单例对象
 * @date 2022/10/2 23:19
 */
public class RegisterSingleton {
    //1、在单例类中声明一个静态内部类
    //2、在静态内部类中声明单例对象并初始化这个单例对象
    private static class SingletonHolder{
        private static final RegisterSingleton INSTANCE = new RegisterSingleton();
    }

    private RegisterSingleton(){};

    public static RegisterSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public void test(){
        System.out.println("登记式单例对象获取成功，调用方法成功！");
    }
}

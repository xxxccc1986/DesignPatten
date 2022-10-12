package singleton;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/10/2 19:30
 */
public class SingletonTest {
    public static void main(String[] args) {
        //饿汉式获取单例对象
        HungrySingleton hungry = HungrySingleton.getSingleInstance();
        hungry.test();
        //懒汉式获取单例对象
        LazySingleton lazy = LazySingleton.getSingleInstance();
        lazy.test();
        //双重检验锁获取单例对象
        DCLSingleton dcl = DCLSingleton.getSingleInstance();
        dcl.test();
        //登记式获取单例对象
        RegisterSingleton registerSingleton = RegisterSingleton.getInstance();
        registerSingleton.test();
        //枚举式获取单例对象
        EnumSingleton.INSTANCE.test();
    }
}

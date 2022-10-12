package singleton;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 单例模式之懒汉式
 * 什么时候使用什么时候创建对象
 * @date 2022/10/2 19:34
 */
public class LazySingleton {
    //创建好单例对象但暂时不进行初始化
    private static LazySingleton instance;
    //私有化类的构造器，防止外部new对象
    private LazySingleton(){
    }
    //提供公共的方法访问此单例对象
    public static synchronized LazySingleton getSingleInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

    public void test(){
        System.out.println("懒汉式单例对象获取成功，调用方法成功！");
    }
}

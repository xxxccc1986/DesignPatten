package singleton;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 单例模式之饿汉式
 * @date 2022/10/2 19:22
 */
public class HungrySingleton {
    //提前先创建好单例对象
    private static HungrySingleton instance = new HungrySingleton();
    //私有化类的构造器，防止外部new对象
    private HungrySingleton(){
    }
    //提供公共的方法访问此单例对象
    public static HungrySingleton getSingleInstance(){
        return instance;
    }

    public void test(){
        System.out.println("饿汉式单例对象获取成功，调用方法成功！");
    }
}

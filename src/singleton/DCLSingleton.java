package singleton;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 单例模式之双重检验锁
 * @date 2022/10/2 19:51
 */
public class DCLSingleton {
    //创建好单例对象但暂时不进行初始化
    private volatile static DCLSingleton instance;
    //私有化类的构造器，防止外部new对象
    private DCLSingleton(){
    }
    //提供公共的方法访问此单例对象
    public static DCLSingleton getSingleInstance(){
        if (instance == null){
            synchronized (DCLSingleton.class){
                if (instance == null){
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }

    public void test(){
        System.out.println("双重检验锁单例对象获取成功，调用方法成功！");
    }
}

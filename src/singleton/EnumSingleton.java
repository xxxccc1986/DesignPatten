package singleton;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 单例模式之枚举式
 * @date 2022/10/2 23:54
 */
public enum EnumSingleton {
 /* 1、枚举类型中定义的变量只能是常量
    2、枚举类型中定义方法(和class类中定义的方法是一样的)
    枚举常量可以作为枚举内部定义方法的访问点，即可以通过INSTANCE.test()来调用
  */
    INSTANCE;

    public void test(){
        System.out.println("枚举式单例对象获取成功，调用方法成功！");
    }
}

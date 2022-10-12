package builder;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 汉堡的抽象类
 * @date 2022/10/3 18:43
 */
public abstract class Burger implements Item{
    /*
    尽管抽象类不需要重写所有接口的方法，
    但是汉堡的打包方式是固定的，都是使用Wrapper类进行打包，
    因此必须实现打包的方法，接口中剩下的方法交由抽象类的实现类来编写即可
     */
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}

package builder;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 瓶子打包方式
 * @date 2022/10/3 18:35
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "瓶子打包";
    }
}

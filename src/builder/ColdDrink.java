package builder;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 冷饮的抽象类
 * @date 2022/10/3 19:48
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}

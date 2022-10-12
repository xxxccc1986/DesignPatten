package builder;

import java.math.BigDecimal;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 鸡肉汉堡
 * @date 2022/10/3 19:47
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(50);
    }
}

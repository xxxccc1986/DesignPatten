package builder;

import java.math.BigDecimal;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 素食汉堡
 * @date 2022/10/3 19:46
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "素食汉堡";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(20);
    }
}

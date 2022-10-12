package builder;

import java.math.BigDecimal;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 可口可乐实体类
 * @date 2022/10/3 19:50
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(3);
    }
}

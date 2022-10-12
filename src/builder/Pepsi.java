package builder;

import java.math.BigDecimal;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 百事可乐实体类
 * @date 2022/10/3 19:49
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(2);
    }
}

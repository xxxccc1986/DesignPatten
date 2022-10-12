package builder;

import java.math.BigDecimal;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 食物条目接口
 * @date 2022/10/3 18:41
 */
public interface Item {
    String name();
    Packing packing();
    BigDecimal price();
}

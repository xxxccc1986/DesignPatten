package command;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 购买股票
 * @date 2022/10/9 21:11
 */
public class BuyStock implements Order{
    //依赖stock对象
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        //购买目标股票的业务操作
        stock.buy();
    }
}

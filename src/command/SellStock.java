package command;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 卖出股票
 * @date 2022/10/9 21:12
 */
public class SellStock implements Order{
    //依赖stock对象
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        //购买目标股票的业务操作
        stock.sell();
    }
}

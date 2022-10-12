package command;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 测试类
 * @date 2022/10/9 21:18
 */
public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("000000", 100);
        BuyStock buyStock = new BuyStock(stock);
        Broker broker = new Broker();
        //请求以命令的形式包裹在对象中，并传给调用对象。
        //调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，
        //该对象执行命令
        broker.takeOrder(buyStock);

        //执行股票交易动作
        broker.placeOrder();
    }
}

package command;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 股票类
 * @date 2022/10/9 21:05
 */
public class Stock {
    private String name;//股票代码
    private int quantity;//股票数量

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void sell(){
        System.out.println("名为：" + name + "股票卖出" + quantity);
    }

    public void buy(){
        System.out.println("名为：" + name + "股票买入" + quantity);
    }
}

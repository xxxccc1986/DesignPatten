package command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 股票操作者类
 * @date 2022/10/9 21:14
 */
public class Broker {
    //存储传入的股票操作命令
    private List<Order> orders = new ArrayList<>();

    //接受命令
    public void takeOrder(Order order){
        orders.add(order);
    }
    //执行命令(购买、出售)
    public void placeOrder(){
        for (Order o : orders){
            o.execute();//执行命令(买入或者卖出股票)
        }
    }
}

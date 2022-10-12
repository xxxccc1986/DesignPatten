package builder;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 就餐类(维护用户点的食物条目)
 * @date 2022/10/3 19:55
 */
public class Meal {
    private ArrayList<Item> items = new ArrayList<>();

    //将用户点的食物条目添加到集合中
    public void addItem(Item item){
        items.add(item);
    }

    //计算食物条目的价格
    public BigDecimal countPrice(){
        BigDecimal price = new BigDecimal(0);
        for (Item i: items) {
            price.add(i.price());
        }
        return price;
    }

    public void showItem(){
        for (Item i: items) {
            System.out.println("食物名字：" + i.name());
            System.out.println("食物包装：" + i.packing().getClass().getSimpleName());
            System.out.println("食物价格：" + i.price());
            System.out.println("========================");
        }
    }

}

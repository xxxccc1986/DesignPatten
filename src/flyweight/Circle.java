package flyweight;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 圆形
 * 创建20圆形，只有5种颜色(要共享的内容)
 * @date 2022/10/8 22:56
 */
public class Circle implements Shape{
    private int x;
    private int y;
    private int radius;
    private String color;

    //因为只有五种颜色是固定的，是20个对象共享的，其他变量都是动态的，
    //因此只需要将color属性用于检查现有的 Circle 对象。
    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.print("绘制了图形" + x + y + radius + ",颜色为：" + color);
    }
}

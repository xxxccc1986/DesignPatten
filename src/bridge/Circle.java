package bridge;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 抽象方
 * @date 2022/10/7 21:45
 */
public class Circle extends Shape{
    private int radius;
    private int x;
    private int y;

    public Circle(DrawAPI drawAPI, int radius, int x, int y) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        //表示具体的绘制动作
        //调用具体的实现来完成图形的绘制
        drawAPI.drawCircle(radius,x,y);
    }
}

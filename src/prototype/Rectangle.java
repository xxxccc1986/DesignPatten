package prototype;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 圆形类
 * @date 2022/10/3 22:28
 */
public class Rectangle extends Shape{
    public Rectangle(){
        super.type = "矩形";
    }

    @Override
    void draw() {
        System.out.println("绘制了矩形");
    }
}

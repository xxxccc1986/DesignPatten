package facade;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 圆形
 * @date 2022/10/8 21:04
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("绘制了圆形");
    }
}

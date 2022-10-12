package abstractfactory;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 矩形
 * @date 2022/10/9 23:44
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("绘制了矩形");
    }
}

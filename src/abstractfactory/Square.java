package abstractfactory;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 正方形
 * @date 2022/10/9 23:43
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("绘制了正方形");
    }
}

package bridge;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 实现方
 * @date 2022/10/7 20:44
 */
public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("填充绿色：" + radius + x + y);
    }
}

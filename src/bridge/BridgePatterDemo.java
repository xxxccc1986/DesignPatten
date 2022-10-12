package bridge;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 测试类
 * @date 2022/10/7 21:49
 */
public class BridgePatterDemo {
    public static void main(String[] args) {
        //创建图形,传递对应的参数信息
        Circle circle = new Circle(new RedCircle(), 1, 1, 1);
        circle.draw();
    }
}

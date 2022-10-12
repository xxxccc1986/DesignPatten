package facade;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 当作客户端看待
 * @date 2022/10/8 21:21
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
    }
}

package decorator;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 测试类
 * @date 2022/10/8 11:57
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        ShapeDecorator decoratorCircle = new RedShapeDecorator(circle);
        decoratorCircle.draw();
    }
}

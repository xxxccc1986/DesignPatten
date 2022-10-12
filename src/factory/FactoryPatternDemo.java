package factory;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 测试类
 * @date 2022/10/9 23:55
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
    }
}

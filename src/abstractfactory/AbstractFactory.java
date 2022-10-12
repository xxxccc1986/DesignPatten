package abstractfactory;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 抽象工厂，用于生产其他工厂
 * @date 2022/10/10 9:20
 */
public abstract class AbstractFactory {
    abstract Shape getShape(String target);
    abstract Color getColor(String color);
}

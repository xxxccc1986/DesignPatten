package abstractfactory;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 测试类
 * @date 2022/10/10 9:31
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory colorFactory = FactoryProducer.getFactor("color");
        Color blue = colorFactory.getColor("Blue");
        blue.fill();
    }
}

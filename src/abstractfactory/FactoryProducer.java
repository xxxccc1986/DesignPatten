package abstractfactory;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 创建具体的生产工厂
 * @date 2022/10/10 9:29
 */
public class FactoryProducer {
    public static AbstractFactory getFactor(String factory){
        if (factory == null){
            return null;
        }
        if ("shape".equalsIgnoreCase(factory)){
            return new ShapeFactory();
        }else if ("color".equalsIgnoreCase(factory)){
            return new ColorFactory();
        }
        return null;
    }
}

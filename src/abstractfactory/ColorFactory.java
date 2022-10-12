package abstractfactory;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 颜色生产工厂，用于生产具体的颜色
 * @date 2022/10/10 9:19
 */
public class ColorFactory extends AbstractFactory{

    @Override
    Shape getShape(String target) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if (color == null){
            return null;
        }else if ("red".equalsIgnoreCase(color)){
            return new Red();
        }else if ("green".equalsIgnoreCase(color)){
            return new Green();
        }else if ("blue".equalsIgnoreCase(color)){
            return new Blue();
        }
        return null;
    }
}

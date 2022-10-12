package factory;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 图形生产工厂
 * @date 2022/10/9 23:48
 */
public class ShapeFactory {

    public Shape getShape(String target){
        if (target == null){
            return null;
        }else if ("circle".equalsIgnoreCase(target)){
            return new Circle();
        }else if ("square".equalsIgnoreCase(target)){
            return new Square();
        }else if ("rectangle".equalsIgnoreCase(target)){
            return new Rectangle();
        }
        return null;
    }
}

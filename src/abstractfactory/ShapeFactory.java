package abstractfactory;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 图形生产工厂，生产具体的图形
 * @date 2022/10/9 23:48
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    Shape getShape(String target) {
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

    @Override
    Color getColor(String color) {
        return null;
    }

    // public Shape getShape(String target){
    //     if (target == null){
    //         return null;
    //     }else if ("circle".equalsIgnoreCase(target)){
    //         return new Circle();
    //     }else if ("square".equalsIgnoreCase(target)){
    //         return new Square();
    //     }else if ("rectangle".equalsIgnoreCase(target)){
    //         return new Rectangle();
    //     }
    //     return null;
    // }

}

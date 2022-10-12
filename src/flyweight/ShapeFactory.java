package flyweight;

import java.util.HashMap;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 这个类用于判断要创建的对象是否需要创建还是直接返回
 * @date 2022/10/8 23:17
 */
public class ShapeFactory {
    /*这一个map对象很关键，整个享元模式是根据这个对象中的信息来判断是否需要创建对象的
    key 表示颜色的值
    value 表示Shape接口类型的对象
     */
    private static HashMap<String, Shape> list = new HashMap<>();


    //获取圆的对象
    public static Shape getShape(String color) {
        //通过颜色值来判断list中是否由此颜色对象
        Circle circle = (Circle) list.get(color);
        if (circle != null){ //有，直接返回此对象
            return circle;
        }
        //没有，创造对象并放入list中.
        Circle newCircle = new Circle(color);
        System.out.println("创建[" + color + "]色圆形成功");
        list.put(color,newCircle);
        return newCircle;
    }

}

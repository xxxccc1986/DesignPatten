package prototype;

import java.util.Hashtable;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 用于创建重复的对象
 * @date 2022/10/3 22:57
 */
public class ShapeCache {
    //用于存储三个需要被复制的原始对象
    private static Hashtable<String,Shape> hashtable  = new Hashtable<>();

    //创建三个原始对象并放入map中
    public static void load(){
        Circle circle = new Circle();
        circle.setId("1");
        Square square = new Square();
        square.setId("2");
        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        hashtable.put(circle.getId(),circle);
        hashtable.put(square.getId(), square);
        hashtable.put(rectangle.getId(),rectangle);
    }

    //克隆对象，需要调用clone()方法来完成
    public static Shape cloneByCache(String id){
        //根据传递id获取被克隆的原始对象
        Shape shape = hashtable.get(id);
        //由于clone()方法返回的是object对象，因此需要将其向下转型
        return (Shape) shape.clone();
    }
}

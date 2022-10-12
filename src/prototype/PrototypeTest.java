package prototype;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: TODO
 * @date 2022/10/3 23:12
 */
public class PrototypeTest {
    public static void main(String[] args) {
        //加载三个原始对象
        ShapeCache.load();

        //克隆
        Shape cloneCircle = ShapeCache.cloneByCache("1");
        System.out.println(cloneCircle.getType());
    }
}

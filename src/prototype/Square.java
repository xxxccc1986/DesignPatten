package prototype;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 圆形类
 * @date 2022/10/3 22:28
 */
public class Square extends Shape{
    public Square(){
        super.type = "正方形";
    }

    @Override
    void draw() {
        System.out.println("绘制了正方形");
    }
}

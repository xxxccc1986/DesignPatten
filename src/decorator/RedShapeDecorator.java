package decorator;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 装饰者类的子类
 * @date 2022/10/8 11:53
 */
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        //1.通过super关键字调用目标对象的方法
        super.draw();
        //2.扩展新功能(就是装饰器的核心代码)
        setRedColor();
    }

    private void setRedColor(){
        System.out.println("图形被填充为红色");
    }
}

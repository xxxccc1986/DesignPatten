package decorator;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 装饰者类，起到规范作用，具体的装饰效果由其子类实现
 * 考虑到后期装饰者类可能不止装饰一个对象，如果将其定义为一个实现类则不太合适
 * 因此将其定义为抽象类并实现接口，具体的装饰逻辑由其子类完成，提高扩展性
 * @date 2022/10/8 11:44
 */
public abstract class ShapeDecorator implements Shape{
    private Shape shape; //装饰的目标对象

    //传递过来的对象就需要初始化
    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        //第一步，调用目标的draw方法
        shape.draw();
        /*
        第二步，扩展新功能(起到装饰效果)，
        如果在此处进行扩展新功能则对扩展性大打折扣，
        因此新功能的扩展可以交由抽象类的子类的draw方法来实现
         */
    }
}

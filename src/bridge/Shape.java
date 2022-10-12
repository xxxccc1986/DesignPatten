package bridge;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 抽象类
 * @date 2022/10/7 21:36
 */
public abstract class Shape {
    //抽象类中依赖了具体的实现，具体的实现剥离出去进行了独立的定义
    //这一步可以视为抽象和具体的解耦，桥接模式的关键步骤
    public DrawAPI drawAPI; //表示颜色填充的属性

    public Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw(); //具体绘制动作实现交给子类来完成

}

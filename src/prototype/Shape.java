package prototype;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 图形的父类(也是个抽象类)
 * Cloneable接口：
 * 1.功能：表示可以通过克隆的技术实现对象的快速创建
 * 2.实现：直接对类的实现Cloneable接口
 * 3.方法：编写一个clone()方法，用来表示具体的克隆操作
 * @date 2022/10/3 22:25
 */
public abstract class Shape implements Cloneable{
    private String id;
    //类型需要在子类中确定(需要在子类中访问父类中的成员)
    protected String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    // public void setType(String type) {
    //     this.type = type;
    // }

    abstract void draw();

    //克隆时不能把具体类型写死，因此返回顶级父类，因为可以向下转型为任何类
    public Object clone(){
        Object clone = null;
        try {
            /* 调用父类的clone()方法将调用此方法的当前类复制一份
               由于此类是抽象类，因此复制的调用类是其实现类某一个
             */
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}

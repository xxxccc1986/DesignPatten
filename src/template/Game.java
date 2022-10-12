package template;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 游戏的模板类(抽象类)，方法由具体的子类完成
 */
public abstract class Game {

    //游戏初始化
    public abstract void initialize();

    //开始游戏
    public abstract void startPlay();

    //结束游戏
    public abstract void endPlay();

    //定义游戏操作方法(模板方法)，通过final确保子类不能修改模板方法
    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }

}

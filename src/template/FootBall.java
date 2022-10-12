package template;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 足球运动
 * 如果当前类还想实现其他父类，扩展就会违背单继承的原则
 * @date 2022/10/9 18:05
 */
public class FootBall extends Game{
    @Override
    public void initialize() {
        System.out.println("足球游戏初始化");
    }

    @Override
    public void startPlay() {
        System.out.println("足球游戏初始化");
    }

    @Override
    public void endPlay() {
        System.out.println("足球游戏初始化");
    }
}

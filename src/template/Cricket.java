package template;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 板球运动
 * @date 2022/10/9 18:04
 */
public class Cricket extends Game{
    @Override
    public void initialize() {
        System.out.println("板球游戏初始化");
    }

    @Override
    public void startPlay() {
        System.out.println("板球游戏开始");
    }

    @Override
    public void endPlay() {
        System.out.println("板球游戏结束");
    }
}

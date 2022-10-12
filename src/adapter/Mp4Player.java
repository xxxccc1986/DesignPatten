package adapter;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: mp4播放类
 * @date 2022/10/7 15:10
 */
public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String filename) {
        //不关注
    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Mp4播放的文件名是：" + filename);
    }
}

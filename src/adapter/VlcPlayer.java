package adapter;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: vlc播放类
 * @date 2022/10/7 15:09
 */
public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String filename) {
        System.out.println("Vlc播放的文件名是" + filename);
    }

    @Override
    public void playMp4(String filename) {
        //不关注
    }
}

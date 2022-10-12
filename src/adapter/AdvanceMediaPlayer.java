package adapter;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 高级媒体播放器接口，添加新类型只需要添加一个抽象方法
 * @date 2022/10/7 0:34
 */
public interface AdvanceMediaPlayer {
    //播放vlc文件
    void playVlc(String filename);
    //播放mp4文件
    void playMp4(String filename);
}

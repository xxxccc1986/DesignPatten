package adapter;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 媒体播放器接口
 * @date 2022/10/6 23:09
 */
public interface MediaPlayer {
    //播放音频文件的方法
    void play(String audioType,String filename);
}

package adapter;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 测试播放
 * @date 2022/10/7 15:18
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        //媒体播放类只需要执行播放方法，不需关注其他东西，不支持的类型由适配器类进行适配
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","test");
    }
}

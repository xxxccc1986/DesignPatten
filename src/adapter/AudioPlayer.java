package adapter;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 音频播放器，只能播放mp3文件
 * 播放其他格式需要借助MediaAdapter媒体适配类
 * @date 2022/10/7 15:16
 */
public class AudioPlayer implements MediaPlayer{
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String filename) {
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("正在播放MP3，文件名是：" + filename);
        }else if (audioType.equalsIgnoreCase("vlc") ||
                  audioType.equalsIgnoreCase("mp4") ){
            //创建当前适配器类的对象，不需要关注具体创建的是什么对象
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,filename);
        }else {
            System.out.println("播放类型不对");
        }
    }
}

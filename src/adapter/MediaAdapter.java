package adapter;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 适配器类
 * @date 2022/10/7 15:13
 */
public class MediaAdapter implements MediaPlayer {
    private AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType){
        if ("vlc".equalsIgnoreCase(audioType)){
            advanceMediaPlayer = new VlcPlayer();
        }else if ("mp4".equalsIgnoreCase(audioType)){
            advanceMediaPlayer = new Mp4Player();
        }
    }
    @Override
    public void play(String audioType, String filename) {
        if ("vlc".equalsIgnoreCase(audioType)){
            advanceMediaPlayer.playVlc(filename);
        }else if ("mp4".equalsIgnoreCase(audioType)){
            advanceMediaPlayer.playMp4(filename);
        }
    }
}

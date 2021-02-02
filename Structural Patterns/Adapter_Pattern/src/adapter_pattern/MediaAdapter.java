package adapter_pattern;

public class MediaAdapter implements MediaPlayer{
    
    AdvancedMediaPlayer advancedAudioPlayer;
    
    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc"))
            advancedAudioPlayer = new VlcPlayer();
        if(audioType.equalsIgnoreCase("mp4"))
            advancedAudioPlayer = new Mp4Player();
    }
    
    
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc"))
            advancedAudioPlayer.playVlc(fileName);
        if(audioType.equalsIgnoreCase("mp4"))
            advancedAudioPlayer.playMp4(fileName);
    }
}
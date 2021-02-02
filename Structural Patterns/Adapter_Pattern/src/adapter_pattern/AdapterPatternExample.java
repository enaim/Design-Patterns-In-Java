package adapter_pattern;

public class AdapterPatternExample {
    
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        
        audioPlayer.play("vlc", "abc.vlc");
        audioPlayer.play("mp3", "efg.mp3");
        audioPlayer.play("mp4", "mno.mp4");
        audioPlayer.play("avi", "xyz.avi");
    }
}

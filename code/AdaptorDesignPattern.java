// MediaPlayer Interface
interface MediaPlayer {
    void play(String audioType, String fileName);
}

// Concrete class implementing MediaPlayer interface
class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing MP3 file. Name: " + fileName);
        } 
        // Use MediaAdapter to play other formats
        else if(audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } 
        else {
            System.out.println("Invalid media. " + audioType + " format not supported.");
        }
    }
}

// MediaAdapter Class that adapts a different format (MP4/VLC) to MediaPlayer
class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new MP4Player();
        }
        else if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer = new VLCPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMP4(fileName);
        } 
        else if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVLC(fileName);
        }
    }
}

// AdvancedMediaPlayer Interface
interface AdvancedMediaPlayer {
    void playVLC(String fileName);
    void playMP4(String fileName);
}

// Concrete classes implementing AdvancedMediaPlayer Interface
class VLCPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing VLC file. Name: " + fileName);
    }

    @Override
    public void playMP4(String fileName) {
        // Do nothing
    }
}

class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        // Do nothing
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing MP4 file. Name: " + fileName);
    }
}

// Test class
public class AdapterPatternTest {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}

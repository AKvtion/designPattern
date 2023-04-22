package Bridging.video;

public class ConcreteMediaPlayer extends MediaPlayer {

    public ConcreteMediaPlayer(MediaFile mediaFile) {
        super(mediaFile);
    }

    @Override
    public void play() {
        mediaFile.play();
    }
}
package Bridging.video;

public abstract class MediaPlayer {
    // 将"媒体文件"作为参数传入，而不直接处理具体格式的音视频数据
    protected MediaFile mediaFile;

    public MediaPlayer(MediaFile mediaFile) {
        this.mediaFile = mediaFile;
    }

    // 抽象方法，留给具体的视频播放器去实现
    public abstract void play();
}

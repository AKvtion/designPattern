package Bridging.video;

public class MPEGFile implements MediaFile {

    @Override
    public void play() {
        System.out.println("播放MPEG格式的视频文件");
    }
}

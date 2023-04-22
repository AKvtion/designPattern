package Bridging.video;

public class AVIFile implements MediaFile {
    @Override
    public void play() {
        System.out.println("播放AVI格式的视频文件");
    }
}

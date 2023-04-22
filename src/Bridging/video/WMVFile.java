package Bridging.video;

public class WMVFile implements MediaFile{
    @Override
    public void play() {
        System.out.println("播放WMV格式的视频文件");
    }
}

package Bridging.video;

public class Clinet {
    public static void main(String[] args) {
        // 创建各种媒体文件类实例
        MPEGFile mpegFile = new MPEGFile();
        RMVBFile rmvbFile = new RMVBFile();
        AVIFile aviFile = new AVIFile();
        WMVFile wmvFile = new WMVFile();

        // 创建WindowsMediaPlayer实例并使用不同的格式播放媒体文件
        ConcreteMediaPlayer mediaPlayer = new ConcreteMediaPlayer(mpegFile);
        mediaPlayer.play();  // 播放MPEG格式的视频文件

        mediaPlayer = new ConcreteMediaPlayer(rmvbFile);
        mediaPlayer.play();  // 播放RMVB格式的视频文件

        mediaPlayer = new ConcreteMediaPlayer(aviFile);
        mediaPlayer.play();  // 播放AVI格式的视频文件

        mediaPlayer = new ConcreteMediaPlayer(wmvFile);
        mediaPlayer.play();  // 播放WMV格式的视频文件
    }
}

package decorator;

// ConcreteDecorator类，摄像头模块装饰器
public class Camera extends Decorator {
    public Camera(Mobilephone mobilephone) {
        super(mobilephone);
    }

    public void videoCall() {
        System.out.println("给手机升级为带视频的通话功能");
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
    }

    @Override
    public void call() {
        System.out.println("使用摄像头装饰器");
        super.call();
        videoCall();
    }
}

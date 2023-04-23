package decorator;

// ConcreteDecorator类，蓝牙模块装饰器
public class Bluetooth extends Decorator {
    public Bluetooth(Mobilephone mobilephone) {
        super(mobilephone);
    }

    public void connect() {
        System.out.println("给手机增加蓝牙连接功能");
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
    }

    @Override
    public void call() {
        super.call();
    }
}

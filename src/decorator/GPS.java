package decorator;

// ConcreteDecorator类，GPS模块装饰器
public class GPS extends Decorator {
    public GPS(Mobilephone mobilephone) {
        super(mobilephone);
    }

    public void setLocation(String location) {
        System.out.println("给手机增加GPS定位功能，方位：" + location);
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
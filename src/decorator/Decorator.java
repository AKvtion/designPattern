package decorator;

// Decorator类，装饰器抽象类
public abstract class Decorator implements Mobilephone {
    private Mobilephone mobilephone;

    public Decorator(Mobilephone mobilephone) {
        this.mobilephone = mobilephone;
    }

    @Override
    public void sendMessage() {
        mobilephone.sendMessage();
    }

    @Override
    public void call() {
        mobilephone.call();
    }
}
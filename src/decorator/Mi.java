package decorator;

public class Mi implements Mobilephone {
    @Override
    public void sendMessage() {
        System.out.println("使用小米手机发送短信");
    }

    @Override
    public void call() {
        System.out.println("使用小米手机进行通话");
    }
}
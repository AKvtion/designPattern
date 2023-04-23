package decorator;

public class Apple implements Mobilephone{
    @Override
    public void sendMessage() {
        System.out.println("使用苹果手机发送短信");
    }

    @Override
    public void call() {
        System.out.println("使用苹果手机进行通话");
    }
}

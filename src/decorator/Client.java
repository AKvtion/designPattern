package decorator;

public class Client {
    public static void main(String[] args) {
        // 创建具体的手机（苹果和小米）
        Mobilephone applePhone = new Apple();
        Mobilephone miPhone = new Mi();

        // 给具体的手机增加蓝牙、GPS、摄像头模块并测试其功能
        Mobilephone phoneWithBluetooth = new Bluetooth(applePhone);
        ((Bluetooth)phoneWithBluetooth).connect();
        phoneWithBluetooth.sendMessage();
        phoneWithBluetooth.call();

        Mobilephone phoneWithGPS = new GPS(miPhone);
        ((GPS)phoneWithGPS).setLocation("120.345, 30.456");
        phoneWithGPS.sendMessage();
        phoneWithGPS.call();

        Mobilephone phoneWithCamera = new Camera(applePhone);
        phoneWithCamera.sendMessage();
        phoneWithCamera.call();
    }
}

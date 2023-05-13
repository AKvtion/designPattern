package behaviorAndCommand.Command;

// 命令的真正执行者
public class LightReceiver {

    public void on() {
        System.out.println(" 照明灯打开了.. ");
    }

    public void off() {
        System.out.println(" 照明灯关闭了.. ");
    }
}
package behaviorAndCommand.Command;

public class Client {
    public static void main(String[] args) {
        //使用命令设计模式，完成通过遥控器，对电灯的操作

        //创建电灯的对象(接受者)
        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        //需要一个遥控器
        RemoteController remoteController = new RemoteController();

        //给我们的遥控器设置命令, 比如 no = 0 是电灯的开和关的操作
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("--------按下灯的开按钮-----------");
        remoteController.onButtonWasPushed(0);
        System.out.println("--------按下灯的关按钮-----------");
        remoteController.offButtonWasPushed(0);
        System.out.println("--------按下撤销按钮-----------");
        remoteController.undoButtonWasPushed();


        System.out.println("=========使用遥控器操作冰箱==========");

        ReReceiver tvReceiver = new ReReceiver();

        ReOffCommand tvOffCommand = new ReOffCommand(tvReceiver);
        ReOnCommand tvOnCommand = new ReOnCommand(tvReceiver);

        //给我们的遥控器设置命令, 比如 no = 1 是冰箱的开和关的操作
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);

        System.out.println("--------按下冰箱的开按钮-----------");
        remoteController.onButtonWasPushed(1);
        System.out.println("--------按下冰箱的关按钮-----------");
        remoteController.offButtonWasPushed(1);
        System.out.println("--------按下撤销按钮-----------");
        remoteController.undoButtonWasPushed();


        System.out.println("=========使用遥控器操作风扇==========");

        FanReceiver fanReceiver = new FanReceiver();

        FanOffCommand fanOffCommand = new FanOffCommand(fanReceiver);
        FanOnCommand fanOnCommand = new FanOnCommand(fanReceiver);

        //给我们的遥控器设置命令, 比如 no = 2 是风扇的开和关的操作
        remoteController.setCommand(2, fanOnCommand, fanOffCommand);

        System.out.println("--------按下风扇的开按钮-----------");
        remoteController.onButtonWasPushed(2);
        System.out.println("--------按下风扇的关按钮-----------");
        remoteController.offButtonWasPushed(2);
        System.out.println("--------按下撤销按钮-----------");
        remoteController.undoButtonWasPushed();


        System.out.println("=========使用遥控器操作洗衣机==========");

        WasherReceiver washerReceiver = new WasherReceiver();

        WasherOffCommand washerOffCommand = new WasherOffCommand(washerReceiver);
        WasherOnCommand washerOnCommand = new WasherOnCommand(washerReceiver);

        //给我们的遥控器设置命令, 比如 no = 3 是洗衣机的开和关的操作
        remoteController.setCommand(3, fanOnCommand, fanOffCommand);

        System.out.println("--------按下洗衣机的开按钮-----------");
        remoteController.onButtonWasPushed(3);
        System.out.println("--------按下洗衣机的关按钮-----------");
        remoteController.offButtonWasPushed(3);
        System.out.println("--------按下撤销按钮-----------");
        remoteController.undoButtonWasPushed();

    }
}

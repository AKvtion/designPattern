package behaviorAndCommand.Command;

public class FanOnCommand implements Command{
//聚合LightReceiver

    FanReceiver fan;

    //构造器
    public FanOnCommand(FanReceiver fan) {
        super();
        this.fan = fan;
    }
    @Override
    public void execute() {
// TODO Auto-generated method stub
        //调用接收者的方法
        fan.on();
    }


    @Override
    public void undo() {
        // TODO Auto-generated method stub
        //调用接收者的方法
        fan.off();
    }
}

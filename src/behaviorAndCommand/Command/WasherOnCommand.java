package behaviorAndCommand.Command;

public class WasherOnCommand  implements Command{

    // 聚合TVReceiver

    WasherReceiver wa;

    // 构造器
    public WasherOnCommand(WasherReceiver wa) {
        super();
        this.wa = wa;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        // 调用接收者的方法
        wa.on();
    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        // 调用接收者的方法
        wa.off();
    }
}

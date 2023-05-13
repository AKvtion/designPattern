package behaviorAndCommand.Command;

public class ReOnCommand implements Command{

    // 聚合TVReceiver

    ReReceiver re;

    // 构造器
    public ReOnCommand(ReReceiver tv) {
        super();
        this.re = tv;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        // 调用接收者的方法
        re.on();
    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        // 调用接收者的方法
        re.off();
    }
}

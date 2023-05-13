package behaviorAndCommand.Command;

public class ReOffCommand  implements Command {

    // 聚合TVReceiver

    ReReceiver re;

    // 构造器
    public ReOffCommand(ReReceiver tv) {
        super();
        this.re = tv;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        // 调用接收者的方法
        re.off();
    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        // 调用接收者的方法
        re.on();
    }
}

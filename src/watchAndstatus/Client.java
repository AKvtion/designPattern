package watchAndstatus;

public class Client {
    public static void main(String[] args) {
        // 初始化销售人员和主管
        ConcreteSalesperson salesperson = new ConcreteSalesperson();
        ConcreteManager manager = new ConcreteManager("John");
        // 将主管注册为观察者
        salesperson.attach(manager);
        // 销售人员售出一套房子时通知主管更新销售消息
        salesperson.sellHouse("New house sold: apartment, 100m2, $500000");
    }
}

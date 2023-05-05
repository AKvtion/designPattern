package Appearance;

public class Main {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        boolean result = computer.start();
        if (result) {
            System.out.println("计算机启动成功");
        } else {
            System.out.println("计算机启动失败");
        }
    }
}

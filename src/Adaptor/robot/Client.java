package Adaptor.robot;

public class Client {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Animal dogAdapter = new DogAdapter(new Dog());
        // 原有方法
        robot.cry();    // 机器人发出嘟嘟声
        robot.move();   // 机器人移动
        // 适配后的方法
        dogAdapter.cry();   // 汪汪叫
        dogAdapter.move();  // 狗跑
    }
}

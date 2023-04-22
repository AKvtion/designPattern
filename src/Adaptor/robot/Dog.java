package Adaptor.robot;

public class Dog implements Animal{
    @Override
    public void cry() {
        System.out.println("汪汪叫");
    }
    @Override
    public void move() {
        System.out.println("狗跑");
    }
}

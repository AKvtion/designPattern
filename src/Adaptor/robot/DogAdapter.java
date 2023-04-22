package Adaptor.robot;

public class DogAdapter implements Animal {
    private Dog dog;

    public DogAdapter(Dog dog) {
        this.dog = dog;
    }
    @Override
    public void cry() {
        dog.cry();
    }
    @Override
    public void move() {
        dog.move();
    }
}

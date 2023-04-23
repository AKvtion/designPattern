package combination.fruit;

public class Fruit implements FruitComponent{
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void eat() {
        System.out.println("吃掉了一个" + this.getName());
    }
}

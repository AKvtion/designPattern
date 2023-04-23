package combination.fruit;

import java.util.ArrayList;
import java.util.List;

public class Plate implements FruitComponent{
    private String name;
    private List<FruitComponent> fruitList = new ArrayList<FruitComponent>();

    public Plate(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void eat() {
        for (FruitComponent fruit : fruitList) {
            fruit.eat();
        }
    }

    public void add(FruitComponent fruit) {
        fruitList.add(fruit);
    }

    public void remove(FruitComponent fruit) {
        fruitList.remove(fruit);
    }
}

package factory.ClothingFactory;

public class MenTrousers implements AbstractProductTrousers {
    @Override
    public void create() {
        System.out.println("男士鞋子");
    }
}

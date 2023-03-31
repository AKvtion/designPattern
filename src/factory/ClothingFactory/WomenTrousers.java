package factory.ClothingFactory;

public class WomenTrousers implements AbstractProductTrousers{
    @Override
    public void create() {
        System.out.println("女士鞋子");
    }
}

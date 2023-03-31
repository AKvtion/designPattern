package factory.ClothingFactory;

public class WomenJacket implements AbstractProductJacket{
    @Override
    public void create() {
        System.out.println("女士夹克");
    }
}

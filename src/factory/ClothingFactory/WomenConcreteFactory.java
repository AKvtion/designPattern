package factory.ClothingFactory;

public class WomenConcreteFactory implements ClothingAbstractFactory{
    @Override
    public AbstractProductJacket createJacket() {
        return new WomenJacket();
    }
    @Override
    public AbstractProductTrousers createTrousers() {
        return new WomenTrousers();
    }
}

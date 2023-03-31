package factory.ClothingFactory;

public class MenConcreteFactory implements ClothingAbstractFactory{
    @Override
    public AbstractProductJacket createJacket() {
        return new MenJacket();
    }
    @Override
    public AbstractProductTrousers createTrousers() {
        return new MenTrousers();
    }
}

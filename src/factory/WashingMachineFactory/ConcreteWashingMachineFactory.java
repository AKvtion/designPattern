package factory.WashingMachineFactory;

//具体工厂类A
public class ConcreteWashingMachineFactory implements WashingMachineFactory{
    @Override
    public ClothingProduct wash() {
        return new ConcreteClothingProduct();
    }
}

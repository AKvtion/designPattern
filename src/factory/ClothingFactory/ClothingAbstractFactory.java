package factory.ClothingFactory;
//接着创建工厂接口（也就是抽象工厂）以及它的具体实现类MenConcreteFactory和WomenConcreteFactory
public interface ClothingAbstractFactory {
    AbstractProductJacket createJacket();
    AbstractProductTrousers createTrousers();
}

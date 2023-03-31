package factory.ClothingFactory;

public class Client {
    public static void main(String[] args) {
        System.out.println("===========男装品牌============");
        MenConcreteFactory menConcreteFactory = new MenConcreteFactory();
        AbstractProductJacket productMenjacket = menConcreteFactory.createJacket();
        productMenjacket.create();
        AbstractProductTrousers productMentrousers = menConcreteFactory.createTrousers();
        productMentrousers.create();
        System.out.println("===========女装品牌============");
        WomenConcreteFactory womenConcreteFactory = new WomenConcreteFactory();
        AbstractProductJacket productWomenJacket = womenConcreteFactory.createJacket();
        productWomenJacket.create();
        AbstractProductTrousers productWomenTrousers = womenConcreteFactory.createTrousers();
        productWomenTrousers.create();
    }
}

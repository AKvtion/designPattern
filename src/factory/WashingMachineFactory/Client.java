package factory.WashingMachineFactory;

public class Client {
    public static void main(String[] args) {
        WashingMachineFactory factory = new ConcreteWashingMachineFactory();
        ClothingProduct wash = factory.wash();
        System.out.println(wash);//输出具体产品A
    }
}

package combination.fruit;

public class Client {
    public static void main(String[] args) {
        // 创建水果和水果盘
        Fruit apple = new Fruit("苹果");
        Fruit banana = new Fruit("香蕉");
        Fruit pear = new Fruit("梨子");
        Plate bigPlate = new Plate("水果盘");
        Plate smallPlate = new Plate("小水果盘");

        // 添加水果到水果盘中
        bigPlate.add(apple);
        bigPlate.add(banana);
        bigPlate.add(pear);

        // 小水果盘中添加水果，再加入到大水果盘中
        smallPlate.add(new Fruit("小苹果"));
        smallPlate.add(new Fruit("小香蕉"));
        bigPlate.add(smallPlate);

        // 吃水果盘中的水果
        bigPlate.eat();
    }
}

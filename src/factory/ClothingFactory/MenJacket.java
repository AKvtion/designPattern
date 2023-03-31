package factory.ClothingFactory;
//接着创建男士夹克，男士鞋子，女士夹克，女士鞋子的具体实现类
public class MenJacket implements AbstractProductJacket {
    @Override
    public void create() {
        System.out.println("男士夹克");
    }
}

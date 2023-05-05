package EnjoyYuan;

public class OrderImpl implements Order{
    private String productName;
    private int orderNum;
    private String orderUser;

    public OrderImpl(String productName, int orderNum, String orderUser) {
        this.productName = productName;
        this.orderNum = orderNum;
        this.orderUser = orderUser;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public int getOrderNum() {
        return orderNum;
    }

    @Override
    public String getOrderUser() {
        return orderUser;
    }

    @Override
    public void setProductName(String name) {
        this.productName = name;
    }

    @Override
    public void setOrderNum(int num) {
        this.orderNum = num;
    }

    @Override
    public void setOrderUser(String user) {
        this.orderUser = user;
    }
}

package EnjoyYuan;

public interface Order {
    String getProductName();
    int getOrderNum();
    String getOrderUser();
    void setProductName(String name);
    void setOrderNum(int num);
    void setOrderUser(String user);
}

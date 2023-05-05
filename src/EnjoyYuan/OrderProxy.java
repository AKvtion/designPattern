package EnjoyYuan;

public class OrderProxy implements Order{
    private Order order;
    private String owner;

    public OrderProxy(Order order, String owner) {
        this.order = order;
        this.owner = owner;
    }

    @Override
    public String getProductName() {
        return order.getProductName();
    }

    @Override
    public int getOrderNum() {
        return order.getOrderNum();
    }

    @Override
    public String getOrderUser() {
        return order.getOrderUser();
    }

    // 只有创建者可以修改订单数据，其他人没有权限修改
    @Override
    public void setProductName(String name) {
        if (owner.equals(order.getOrderUser())) {
            order.setProductName(name);
        } else {
            throw new UnsupportedOperationException("No authority to modify order data.");
        }
    }

    @Override
    public void setOrderNum(int num) {
        if (owner.equals(order.getOrderUser())) {
            order.setOrderNum(num);
        } else {
            throw new UnsupportedOperationException("No authority to modify order data.");
        }
    }

    @Override
    public void setOrderUser(String user) {
        if (owner.equals(order.getOrderUser())) {
            order.setOrderUser(user);
        } else {
            throw new UnsupportedOperationException("No authority to modify order data.");
        }
    }
}

package EnjoyYuan;

public class Client {
    public static void main(String[] args) {
                Order order = new OrderImpl("ProductA", 100, "creator");
                OrderProxy orderProxy = new OrderProxy(order, "creator");

                System.out.println("Before modification:");
                System.out.println("Product name: " + orderProxy.getProductName());
                System.out.println("Product number: " + orderProxy.getOrderNum());
                System.out.println("Product owner: " + orderProxy.getOrderUser());

                // 修改订单数据
                orderProxy.setProductName("ProductB");
                orderProxy.setOrderNum(200);
                orderProxy.setOrderUser("new owner");

                System.out.println("After modification:");
                System.out.println("Product name: " + orderProxy.getProductName());
                System.out.println("Product number: " + orderProxy.getOrderNum());
                System.out.println("Product owner: " + orderProxy.getOrderUser());

                // 非创建者无法修改订单数据
                OrderProxy orderProxy2 = new OrderProxy(order, "other user");
                try {
                    orderProxy2.setProductName("ProductC");
                } catch (UnsupportedOperationException e) {
                    System.out.println(e.getMessage());
                }
    }
}

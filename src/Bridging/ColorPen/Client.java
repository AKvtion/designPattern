package Bridging.ColorPen;

public class Client {
    public static void main(String[] args) {
        // 创建3种型号的画笔
        Pen smallPen = new SmallPen();
        Pen middlePen = new MiddlePen();
        // 创建2种颜色
        Color red = new Red();
        Color green = new Green();
        // 使用 Brush 实现不同颜色和型号的组合绘制
        Pen brush = new Brush(smallPen, green);
        brush.draw(); // 小号画笔，使用绿色
        brush = new Brush(middlePen, red);
        brush.draw(); // 中号画笔，使用红色
    }
}

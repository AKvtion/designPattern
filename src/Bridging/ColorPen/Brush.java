package Bridging.ColorPen;

public class Brush implements Pen{
    protected Pen pen;
    protected Color color;

    public Brush(Pen pen, Color color) {
        this.pen = pen;
        this.color = color;
    }

    @Override
    public void draw() {
        pen.draw(); // 先按特定型号绘制基本图形
        color.paint(); // 再按随机或特定算法涂上相应颜色的笔触或填充色
    }
}

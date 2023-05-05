package proxyMode;

public class WhiteFlyWeight  extends FlyWeight {
    @Override
    public void display(int x, int y) {
        this.x = x;
        this.y = y;

    }
}

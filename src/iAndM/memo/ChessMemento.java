package iAndM.memo;

public class ChessMemento {
	private int x;
	private int y;//象棋的当前坐标
	private int id;//棋子的id
	private String label;//棋子名称
	
	@Override
	public String toString() {
		return "ChessMemento [x=" + x + ", y=" + y + ", id=" + id + ", label=" + label + "]";
	}

	public ChessMemento(int x, int y, String label) {
		super();
		this.x = x;
		this.y = y;
		this.label = label;
	}
	
	public ChessMemento() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

}

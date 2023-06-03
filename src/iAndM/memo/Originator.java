package iAndM.memo;

public class Originator {
	private int x;
	private int y;//象棋的当前坐标
	private int id;//棋子的id
	private String label;//棋子名称
	public Originator(int x, int y, String label) {
		super();
		this.x = x;
		this.y = y;
		this.label = label;
	}
	public void setState(int x,int y){
		this.x = x;
		this.y = y;
	}
	public ChessMemento CreatMemento(){
		return new ChessMemento(x,y,label);
	}
	public void setMemento(ChessMemento c){
		if(c==null)return;
		this.x = c.getX();
		this.y = c.getY();
		this.id = c.getId();
		this.label = c.getLabel();
	}
	
	public void show(){
		System.out.println(CreatMemento());
	}

}

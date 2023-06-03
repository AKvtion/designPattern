package iAndM.memo;

import java.util.ArrayList;

public class CareTaker {
	private ArrayList<ChessMemento> list = null;
	public CareTaker() {
		super();
		list = new ArrayList<ChessMemento>();
	}
 
	public void addMemento(ChessMemento c){
		list.add(c);
	}
	
	public ChessMemento huiQi(){
		if(list.isEmpty()){
			System.out.println("无法悔棋！！");
			return null;
		}else{
			int index = list.size();
			ChessMemento c = (ChessMemento)list.get(index-1);
			list.remove(index-1);
			return c;
		}
	}

}

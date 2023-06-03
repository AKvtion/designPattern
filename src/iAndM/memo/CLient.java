package iAndM.memo;

public class CLient {

	public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();
		careTaker.huiQi();
		
		Originator o = new Originator(0,0,"炮");
		o.show();
		careTaker.addMemento(o.CreatMemento());
		
		o.setState(0, 5);
		o.show();
		
		System.out.println("--现在悔棋--");
		o.setMemento(careTaker.huiQi());
		o.show();
 
		
		o.setState(6, 0);
		o.show();
		careTaker.addMemento(o.CreatMemento());
 
		o.setState(6, 9);
		o.show();
		careTaker.addMemento(o.CreatMemento());
 
		o.setState(4, 9);
		o.show();
 
		
		System.out.println("--现在悔棋--");
		o.setMemento(careTaker.huiQi());
		o.show();
		
		System.out.println("--现在悔棋--");
		o.setMemento(careTaker.huiQi());
		o.show();
		
		System.out.println("--现在悔棋--");
		o.setMemento(careTaker.huiQi());
		o.show();


	}

}

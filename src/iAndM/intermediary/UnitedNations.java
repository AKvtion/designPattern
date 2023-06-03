package iAndM.intermediary;

import java.util.ArrayList;

//抽象中介类
public abstract class UnitedNations {
	// 用于存储同事对象
	protected ArrayList<ColleagueNations> colleagues = new ArrayList<ColleagueNations>();

	// 注册方法，用于增加同事对象
	public void register(ColleagueNations colleague) {
		colleagues.add(colleague);
	}

	// 声明抽象的业务方法
	public abstract void operation();
}

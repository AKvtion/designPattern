package iAndM.intermediary;

//具体中介类
public class WTO extends UnitedNations {
	// 实现业务方法，封装同事之间的调用
	public void operation() {
		((ColleagueNations) (colleagues.get(0))).method1(); // 通过中介者调用同事类的方法
	}
}

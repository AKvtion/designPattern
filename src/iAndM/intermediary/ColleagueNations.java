package iAndM.intermediary;

//抽象同事类
public abstract class ColleagueNations {
	// 维持一个抽象中介者的引用
	protected UnitedNations unations;

	public ColleagueNations(UnitedNations unations) {
		this.unations = unations;
	}

	// 声明自身方法，处理自己的行为
	public abstract void method1();

	// 定义依赖方法，与中介者进行通信
	public void method2() {
		unations.operation();
	}
}

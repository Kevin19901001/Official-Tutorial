package part02.chapter03;

/**
 * 定义一个MountainBkie类： 这个类大概描述继承：子类继承父类所有的成员变量和方法，并且可以添加子类自己的成员变量和方法。
 * 
 * @author FanHuanQing
 * @since 2024-03-28
 */
public class MountainBike extends Bicycle {

	// 定义一个山地车子类自己的成员变量
	public int seatHeight; // 座高

	// 继承自父类的构造器
	public MountainBike(int startCadence, int startSpeed, int startGear) {
		super(startCadence, startSpeed, startGear);
	}

	// 添加一个山地车子类自己的构造器
	public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
		super(startCadence, startSpeed, startGear);
		gear = startGear;
	}

	// 添加一个山地车子类自己的方法
	public void setSeatHeight(int newValue) {
		seatHeight = newValue;
	}

	public static void main(String[] args) {

	}

}

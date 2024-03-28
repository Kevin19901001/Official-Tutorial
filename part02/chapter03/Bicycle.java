package part02.chapter03;

/**
 * 定义一个Bicycle类
 * 这个类大概描述类的定义：定义类，定义成员变量，定义构造器，定义方法
 * 
 * @Author FanHuanQing
 * @Since 2024-03-28
 *
 */
public class Bicycle {

	// Bicycle类定义3个属性
	public int cadence; // 节奏
	public int gear; // 传动装置
	public int speed; // 速度

	// Bicycle类定义1个构造器
	public Bicycle(int startCadence, int startSpeed, int startGear) {
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;
	}

	// Bicycle类定义4个方法
	public void setCadence(int newValue) {
		cadence = newValue;
	}

	public void setGear(int newValue) {
		gear = newValue;
	}

	public void applyBrake(int decrement) {
		speed -= decrement;
	}

	public void speedUp(int increment) {
		speed += increment;
	}

	public static void main(String[] args) {

	}

}

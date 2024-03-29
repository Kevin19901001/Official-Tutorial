package part02.chapter03;

/**
 * 定义一个Bicycle类 这个类大概描述类的定义：定义类，定义成员变量，定义构造器，定义方法
 * 
 * @Author FanHuanQing
 * @Since 2024-03-28
 *
 */
public class Bicycle {

	// 3.2 此处讲述成员变量：
	// 1、在类中的变量，称为成员变量；
	// 2、在方法或者代码块中的变量，称为局部变量；
	// 3、在方法（括号）中的变量，称为参数

	// 成员变量的定义，由一下3个部分组成：
	// 1、修饰符，如：public、private，要或者不要都可以；
	// 2、成员变量的类型；
	// 3、成员变量的名称

	// 变量修饰符：
	// 1、public---可以通过所有的类访问；
	// 2、private---只能通过自己的类访问

	// Bicycle类定义3个成员变量
//	public int cadence; // 节奏
//	public int gear; // 传动装置
//	public int speed; // 速度

	// 在“封装”的思想中，通常用private来修饰成员变量
	private int cadence;
	private int gear;
	private int speed;

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

	// 如果仍然要访问它们，可以通过添加共有的方法来获得它们。
	public int getGear() {
		return gear;
	}

	public int getSpeed() {
		return speed;
	}

	public int getCadence() {
		return cadence;
	}

	public static void main(String[] args) {

	}

}

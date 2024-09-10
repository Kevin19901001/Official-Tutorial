package part02.chapter03;

/**
 * @author FanHuanQing
 * 
 * @since 2024-09-07
 * 
 *        第3节：对象。
 * 
 *        矩形类。
 * 
 *        不同的构造器允许你为矩形的原坐标、长和宽提供初始化值，可以是基础数据类型，也可以是引用数据类型。
 * 
 *        如果一个类有不同的构造器，那么它们的签名必须不同。Java编译器根据参数的数量和类型来区分不同的构造器。
 * 
 *        所有类都至少有1个构造器，如果定义类时，没有显式地定义构造器，编译器会自动提供一个无参数构造器，称之为“默认构造器”。
 *        这个默认构造器，会调用这个类地父类地无参数构造器或者Object类地构造器。
 */
public class Rectangle {

	public int width;
	public int height;
	public Point origin;

	public Rectangle() {
		super();
	}

	public Rectangle(Point origin) {
		super();
		this.origin = origin;
	}

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point origin, int width, int height) {
		super();
		this.origin = origin;
		this.width = width;
		this.height = height;
	}

	public void move(int x, int y) {
		origin.x = x;
		origin.y = y;
	}

	public int getArea() {
		return width * height;
	}

}

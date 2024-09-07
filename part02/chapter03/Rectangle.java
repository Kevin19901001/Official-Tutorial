package part02.chapter03;

/**
 * @author FanHuanQing
 * 
 * @since 2024-09-07
 * 
 *        矩形类。
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

	public Rectangle(int width, int height, Point origin) {
		super();
		this.width = width;
		this.height = height;
		this.origin = origin;
	}

	public void move(int x, int y) {
		origin.x = x;
		origin.y = y;
	}

	public int getArea() {
		return width * height;
	}

}

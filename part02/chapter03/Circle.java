package part02.chapter03;

/**
 * @author FanHuanQing
 * 
 * @since 2024-09-01
 * 
 * 参数名称
 * 
 */
public class Circle {

	@SuppressWarnings("unused")
	private int x, y, radius;
	
	public Circle(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setOrigin(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * 引用数据类型参数，比如对象，同样也以值的形式传入方法。
	 * 这意味着，当方法返回时，被传入的引用，依然持有这之前的对象。
	 * 然而，如果有适当的访问级别，对象的属性的值，在方法中是可以改变的。
	 * @param circle
	 * @param deltaX
	 * @param deltaY
	 */
	public void moveCircle(Circle circle, int deltaX, int deltaY) {
		circle.setX(circle.getX() + deltaX);
		circle.setY(circle.getY() + deltaY);
		
		circle = new Circle(0, 0);
	}
}

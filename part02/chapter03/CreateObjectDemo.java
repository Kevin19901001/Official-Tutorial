package part02.chapter03;

/**
 * @author FanHuanqing
 * @since 2024-09-06 创建对象的示例。
 */
public class CreateObjectDemo {

	public static void main(String[] args) {
		// 定义和创建1个点对象和2个矩形对象
		Point originOne = new Point(23, 94);
		Rectangle rectOne = new Rectangle(originOne, 100, 200);
		Rectangle rectTwo = new Rectangle(50, 100);

		// 展示rectOne的长、宽和面积
		System.out.println("width of rectOne:" + rectOne.width); // 100
		System.out.println("height of rectOne:" + rectOne.height); // 200
		System.out.println("area of rectOne:" + rectOne.getArea()); // 20000

		// 重置rectTwo的坐标
		rectTwo.origin = originOne;

		// 展示rectTwo的坐标
		System.out.println("X position of rectTwo:" + rectTwo.origin.x); // 23
		System.out.println("Y position of rectTwo:" + rectTwo.origin.y); // 94

		// 移动rectTwo并且展示它的新坐标
		rectTwo.move(80, 160);
		System.out.println("X position of rectTwo:" + rectTwo.origin.x); // 80
		System.out.println("Y position of rectTwo:" + rectTwo.origin.y); // 160
	}

}

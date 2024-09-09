package part02.chapter03;

/**
 * @author FanHuanqing
 * @since 2024-09-06
 * 
 *        创建对象的示例。
 * 
 *        类为对象提供模板，对象从类创建出来。
 * 
 *        类型和变量名定义对象，new关键字实例化类，调用构造器初始化对象，这是一般创建对象的过程。
 * 
 *        直到对象被创建出来并且赋值给类型所关联的变量名，它（变量名）的值才被确定下来。
 * 
 *        简单地定义一个引用（变量名），并没有切实地创建出一个对象。所以需要用到new操作符，必须在使用之前将对象指派（赋值）给引用（变量名），否则，会出现编译错误。
 * 
 *        实例化类：new操作符，通过给新的对象划定内存并返回给该内存一个引用，来实例化类。同时，new操作符调用了对象构造器。
 * 
 *        new操作符请求一个单一的、前置的参数：对构造器的调用。构造器的名称提供了类的名称去实例化。
 * 
 *        new操作符对象创建时返回给对象一个引用，这个引用通常被指派给对应类型的变量名。
 * 
 *        new操作符返回的引用不是必须要指派给变量，它可以直接在表达式中被使用。
 * 
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

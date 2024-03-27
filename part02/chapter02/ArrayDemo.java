package part02.chapter02;

/**
 * 数组初始化
 * 
 * @author FanHuanQing
 *
 * @since 2023-04-09
 */
public class ArrayDemo {

	public static void main(String[] args) {

		// 定义一个int[]类型的数组
		int[] anArray;

		// 分配10个int内存
		anArray = new int[10];

		// 初始化第1个元素
		anArray[0] = 100;

		// 初始化第2个元素
		anArray[1] = 200;

		// 其它
		anArray[2] = 300;
		anArray[3] = 400;
		anArray[4] = 500;
		anArray[5] = 600;
		anArray[6] = 700;
		anArray[7] = 800;
		anArray[8] = 900;
		anArray[9] = 1000;

		// 输出前3个蒜素
		System.out.println(anArray[0]);
		System.out.println(anArray[1]);
		System.out.println(anArray[2]);
		System.out.println(anArray.length); // 10

		// 虽然不报错，但是不鼓励这种写法
		// float anArrayOfFloat[];

	}

}

package part02.chapter02;

/**
 * 多维数组
 * 
 * @author FanHuanQing
 * 
 * @since2023-04-09
 */
public class MultiDimArrayDemo {

	public static void main(String[] args) {

		String[][] names = { { "Mr. ", "Mrs. ", "Ms. " }, { "Smith", "Jones" } };

		// Mr Smith
		System.out.println(names[0][0] + names[1][0]);

		// Ms Jones
		System.out.println(names[0][2] + names[1][1]);

	}

}

package part02.chapter03;

/**
 * @author FanHuanQing
 * 
 * @since 2024-09-02
 * 
 * 基本类型参数，如整形和浮点型，是以值的方式传递给方法的。
 * 这意味着，参数值的改变，仅仅存在于方法域内。
 * 当方法返回时，参数已成为过去，并且任何改变都会消失。
 * 下面是一个例子：
 * 
 */
public class PassPrimitiveByValue {

	public static void main(String[] args) {
		int x = 3;

		passMethod(x);

		System.out.println("After invoking passMethod, x = " + x); // x = 3
	}

	public static void passMethod(int p) {
		p = 10;
	}

}

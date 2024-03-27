package part02.chapter01;

/**
 * 
 * @author FanHuanQing
 * 
 * @since 2023-04-15
 *
 */
public class Exercise {

	/*
	 * 1.Create a small program that defines some fields. Try creating some illegal
	 * field names and see what kind of error the compiler produces. Use the naming
	 * rules and conventions as a guide.
	 * 
	 */
	String answer;

	int score;

	public static void main(String[] args) {

		/*
		 * 2.In the program you created in Exercise 1, try leaving the fields
		 * uninitialized and print out their values. Try the same with a local variable
		 * and see what kind of compiler errors you can produce. Becoming familiar with
		 * common compiler errors will make it easier to recognize bugs in your code.
		 */

		Exercise exercise = new Exercise();

		System.out.println("answer:" + exercise.answer);
		System.out.println("score:" + exercise.score);

		// int score;

		// String answer;

		// System.out.println(score); //The local variable score may not have been
		// initialized
		// System.out.println(answer); // The local variable score may not have been
		// initialized

	}

}

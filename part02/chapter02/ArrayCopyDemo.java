package part02.chapter02;

/**
 * 
 * @author FanHuanQing
 * 
 * @since 2023-04-23
 *
 */
public class ArrayCopyDemo {

	public static void main(String[] args) {

		String[] copyFrom = { "Affogato", "Americano", "Cappucino", "Correto", "Cortado", "Doppio", "Espresso",
				"Frappucino", "Fredo", "Lungo", "Macchiato", "Marocchino", "Ristretto" };

		String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);

		for (String coffee : copyTo) {
			System.out.print(coffee + " ");
		}

		java.util.Arrays.stream(copyTo).map(coffee -> coffee + " ").forEach(System.out::print);

		System.out.println(java.util.Arrays.toString(copyTo));

	}

}

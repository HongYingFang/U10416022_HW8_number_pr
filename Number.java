//U10416022
import java.math.BigDecimal;
public class Number {

	void promote(int cal, String num1, String num2) {

		// new BigDecimal
		BigDecimal number1 = new BigDecimal(num1);
		BigDecimal number2 = new BigDecimal(num2);

		// Use if-else statement to decide a arithmetic includes
		// add,subtract,multiply
		if (cal == 1) {
			// +
			System.out.println(number1.add(number2));
		} else if (cal == 2) {
			// -
			System.out.println(number1.subtract(number2));
		} else if (cal == 3) {
			// *
			System.out.println(number1.multiply(number2));

		} else {
			System.out.println("error");
		}
	}

	void div(int scale, int cal, String num1, String num2) {

		// new BigDecimal
		BigDecimal number1 = new BigDecimal(num1);
		BigDecimal number2 = new BigDecimal(num2);
		// divide
		if (cal == 4) {
			if (scale < 0) {
				System.out.println("The scale must be a positive integer or zero");

			} else {
				System.out.println(number1.divide(number2, scale, BigDecimal.ROUND_HALF_UP));
			}

		} else {
			System.out.println("error");
		}
	}

}

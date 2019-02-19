import java.util.ArrayList;
import java.util.List;

class _Utils {
	private int sum;
	private List<Integer> multiples;

	public _Utils(int number1, int number2, int range) {
		sum = 0;
		multiples = new ArrayList<>();
		calculate(number1, number2, range);
	}

	private void calculate(int number1, int number2, int range) {
		sum = 0;
		multiples.clear();
		for (int i = 1; i < range; i++) {
			if (i % number1 == 0 || i % number2 == 0) {
				sum += i;
				multiples.add(i);
			}
		}
	}

	public int getSum() {
		return this.sum;
	}

	public List<Integer> getListMultiples() {
		return this.multiples;
	}

}

public class PrintSumAndMultiples {

	// Program to calculate the sum of the multiples of two numbers below 'N'.
	public static void main(String[] args) {
		int number1 = 3;
		int number2 = 5;
		int range = 10;
		_Utils utilsObj = new _Utils(number1, number2, range);
		System.out.println("Sum: " + utilsObj.getSum());
		System.out.println("Multiples of " + number1 + " & " + number2 + " below " + range + " : " + utilsObj.getListMultiples());
		
		/**
		* #OUTPUT
		* Sum: 23
		* Multiples of 3 & 5 below 10 : [3, 5, 6, 9]
		**/
		
	}

}

package math;

import java.math.BigInteger;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int count=0;
		long sum = 2;
		for (int i = 3; i < 100; i++) {
			if (isPrime(i)) {

				count++;
				System.out.println(i);

			}
		}
		System.out.println(count);
	}

		 static boolean isPrime(int n) {
			if (n < 2) {
				return false;
			}
			if (n == 2 || n == 3) {
				return true;
			}
			if ((n & 1) == 0 || n % 3 == 0) {
				return false;
			}
			int sqrtN = (int) Math.sqrt(n) + 1;
			for (int i = 6; i <= sqrtN; i += 6) {// loop 6 step
				if (n % (i - 1) == 0 || n % (i + 1) == 0) {
					return false;
				}
			}
			return true;
		}

}
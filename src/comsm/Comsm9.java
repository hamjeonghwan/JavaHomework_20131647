package comsm;

import java.util.Random;
import java.util.Scanner;

public class Comsm9 {
	private static final double SIZEa = 0.342;
	private static final double SIZEb = 0.136;
	private static final double SIZEc = 0.022;

	public static void main(String[] args) {
		double n = 5000;

		Scanner scr = new Scanner(System.in);

		System.out.print("평균값\n");
		double b = scr.nextDouble();

		System.out.print("표준편차\n");
		double c = scr.nextDouble();

		Random random = new Random();

		for (int i = 0; i < n * SIZEa; i++) {
			if (random.nextBoolean()) {
				System.out.println(random.nextDouble() * c + b - 1 * c);
			} else {
				System.out.println(random.nextDouble() * c + b + 0 * c);
			}
		}

		for (int i = 0; i < n * SIZEb; i++) {
			if (random.nextBoolean()) {
				System.out.println(random.nextDouble() * c + b - 2 * c);
			} else {
				System.out.println(random.nextDouble() * c + b + 1 * c);
			}
		}

		for (int i = 0; i < n * SIZEc; i++) {
			if (random.nextBoolean()) {
				System.out.println(random.nextDouble() * c + b - 3 * c);
			} else {
				System.out.println(random.nextDouble() * c + b + 2 * c);
			}
		}
		
		for (int i = 0; i < n - n * SIZEa - n * SIZEb - n * SIZEc; i++) {
			System.out.println(random.nextDouble() * 100);
		}
	}
}

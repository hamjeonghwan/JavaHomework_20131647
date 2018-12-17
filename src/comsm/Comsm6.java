package comsm;

import java.util.Random;

public class Comsm6 {
	public static void main(String[] args) {

		Random r = new Random();

		int n = 1000000;
		double a[] = new double[n];

		double u = r.nextDouble();

		for (int i = 0; i < a.length; i++)

		{
			a[i] = -Math.round(n / 3) / 10000.0;

			System.out.println(a[i]);
			return;
		}

	}

}

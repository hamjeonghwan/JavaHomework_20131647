package comsm;
import java.util.*;

public class Comsm5 {
	public static void main(String[] args) {

        Random r = new Random();

        int n = 1000000;

        double a[]= new double [n];

        Scanner scr = new Scanner(System.in);

        System.out.println("ют╥б");

        double lambda = scr.nextDouble();

        for( int i = 0 ; i < a.length ; i++)

        {
               double u = r.nextDouble();

               a[i] = - Math.log((1-u)/lambda);

               System.out.println(a[i]);
        }
	}
}

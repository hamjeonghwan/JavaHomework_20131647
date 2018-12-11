package comsm;

public class Comsm4 {
	private static final int n=1000;
	private static final double p= 0.5;
	public static void main(String[] args) {
		for (int i=0; i<n; i++) {
			System.out.print("\n"+a(p, n, i));
		}
	}
	public static double  a(double p, int n, int x) {
		double n1=0;
		for(int i=1; i<=x; i++) {
			n1 +=Math.log(n+1-i);
		}
		double n2=0;
		for(int i=1; i<=x; i++) {
			n2 +=Math.log(i);
		}
		double p1= n1-n2+x*Math.log(p)+(n-x)*Math.log(1-p);
		
		return Math.exp(p1);
		}
}
package comsm;
import java.util.*;
public class Comsm7 {

    public static double ranper(double r1, double r2){
        
        double count=0;

        for(int k=0;k<10000;k++){
        r1=random();
        r2=random();
        double ransum=(r1*r1)+(r2*r2);

        if(ransum>0&&ransum<1){
        count = count+1;
        }
        else
            count=count-1;
         }
        return count/10000;
    }
/*    public static double  sector(double radius, double cAngle){
        cAngle=random();
        for(int p=0;p<10;p++)
        System.out.println(cAngle);
    return radius*radius*Math.PI;
    }
*/
    static final int bigPrimeNumber = 65539;
    static int save;
    static int seed;
    static boolean firstTime = true;

    public static void main(String[] args){
        System.out.print("1. �������� 1�� 1��и��� ��ä���� ���� : ");
        System.out.println("");
        double cAngle=0;
    //    System.out.println(sector(1,cAngle));

        seed = Integer.parseInt(args[0]);
        
        System.out.println("2. �Ͼ���� ���� ���� ������ 1000����ϰ� 100������ ���� �߻� �� 1000���� �� ������ ���ϴ°� �˻��Ѵ� : "); 
        

        for (int j=0 ; j<1000 ; j++ ){
            for (int i =0; i < 1000; i++ ){

            }

        }
        System.out.println("3. 0 < r1, r2 < 1�� ���� �� <r1, r2>�� 10000�� �߻����� ��ǥ (r1, r2)�� x2 + y2 = 1�� �� ���ο� ���ϴ� ���� : ");
        double r1=0,r2=0;
        System.out.println(ranper(r1,r2));
    }
    static double random(){
        if(firstTime) {
            save = seed * bigPrimeNumber;
            firstTime = false;
        }
        else save = save * bigPrimeNumber;
        if(save < 0) save = ~save;
        double r = save / 2147483647.0;
        return r;
    }
}

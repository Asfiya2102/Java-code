import java.util.Scanner;
 import java.lang.Math;
public class Power {
    public static void main(String[] args) {
        int x;
        int n;
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        n=s.nextInt();
        double result=Math.pow(x, n);
        System.out.println(result);
    }
    
}

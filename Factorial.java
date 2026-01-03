import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        int count=1;
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();

        while(count<=n){
            fact=fact*count;
            count++;

        }System.out.print(fact);
    }
}

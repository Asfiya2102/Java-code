import java.util.Scanner;

public class Reversenum {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int rev=0;
        int digit;
        while(n!=0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }System.out.print(rev);
    }
}

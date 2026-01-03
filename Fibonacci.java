import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n;
        int sum;
        int i;
        Scanner s=new Scanner(System.in) ;
        n=s.nextInt();
        System.out.print(a);
        System.out.print(b);
        for(i=1;i<=n;i++){
            
           sum=a+b;
           a=b;
           b=sum; 
          System.out.print(sum);

        }

    }
    
}

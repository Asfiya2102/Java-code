import java.util.Scanner;
public class Multiply {
    public static int calMultiply(int a,int b){
     return(a*b);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       int  a=s.nextInt();
       int  b=s.nextInt();
    
       System.out.println(calMultiply( a,  b));
    }

    
}

import java.util.Scanner;
public class Add {
    public static int calculateSum(int a, int b){
        int sum=a+b;
        return sum;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int sum=calculateSum(a,b);
        System.out.println(sum);

    }
    
    
}

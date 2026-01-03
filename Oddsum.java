import java.util.Scanner;
public class Oddsum {
    public static int Sum(int n){
        int i=1;
        int sum=0;
       
        for(i=1;i<=n;i++){
            if(i%2!=0){
           sum=sum+i ;
        }
    }return sum;
    
}public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   System.out.println(Sum(n));


}
}

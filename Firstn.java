import java.util.*;
public class Firstn {
    public static void main(String[] args) {
        int n;
        int i=0;
         int sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
     // while(i<=n){
       // sum=sum+i;
       // i++;
        
     // }
     for(i=1;i<=n;i++){
        sum=sum+i;

     }


        System.out.println("The sum of first "+n+" natural numbers is "+ sum);
        sc.close();

    }
    
}

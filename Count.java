import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        int positive=0;
        int negative=0;
        int zero=0;
        int i;
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
       
        for(i=a;i<=b;i++){
            if(i>=1){
               positive++;

        }else if(i==0){
            zero++;
        }else if(i<1){
            negative++;
        }

    }
 System.out.println("positive numbers"+positive);
  System.out.println("negative numbers"+negative);
   System.out.println("zero"+zero);
    
}  
    
}

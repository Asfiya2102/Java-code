import java.util.Scanner;
public class Age {
    public static void age(int a){
       if(a>=18){
        System.out.println("eligible");
       }else{
        System.out.println("not eligible");
       }
    }
    

public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
 
age(a);
}
}

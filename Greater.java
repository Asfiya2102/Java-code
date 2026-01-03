import java.util.Scanner;
public class Greater {
    public static int Great(int a ,int b){
        if(a>b){
           return a;
        }else{
           return b;
    }
    
}
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
   int  a=s.nextInt();
   int  b=s.nextInt();
System.out.println(Great(a,b));
}
}

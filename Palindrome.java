import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n;
       
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int num=n;
        int rev=0;
        int digit;
        
        while(n!=0){
            
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }if(rev==num){
            System.out.print("is palindrome");
        }else{
            System.out.print("not Palindrome");
        }
    }
}
 
    
    


import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
         int n;
        int i=0;
        
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<11;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }


    }
    
}

import java.util.Scanner;
public class Circle {
    public static double calculateCircum(int r){
        return 2*r*(3.14);

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        System.out.println(calculateCircum(r));

    }
    
}
import java.util.*;
public class Greetings {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a;
    a=sc.nextInt();
    sc.close();
    switch(a){
    case 1 : System.out.println("Assalamualikum");
    break;
    case 2 : System.out.println("annyeonghaseyo");
    break;
    case 3 : System.out.println("Hola");
    break;
    default : System.out.println("invalid button");



    }

    }
    
}

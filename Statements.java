import java.util.*;
public class Statements {
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int age;
      age=sc.nextInt();
      if(age>=18 && age<120){
        System.out.println("Eligible to vote");
      }
      else if(age<18){
         System.out.println("Not Eligible");
         }
       else if(age==0||age>120){
          System.out.println("Invalid age");
          
       }
    sc.close();
}
    
}

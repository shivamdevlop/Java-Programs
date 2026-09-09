import java.util.Scanner;

public class simpleinterest{
    public static void main (String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("enter the principal ");
      double principal=sc.nextDouble();
      System.out.print("enter the rate ");
      double rate=sc.nextDouble();
      System.out.print("enter the time ");
      double time=sc.nextDouble();
      double si=principal*rate*time/100;
      Double amount=principal+si;
      System.out.println(si);
      System.out.println(amount);

    }
}

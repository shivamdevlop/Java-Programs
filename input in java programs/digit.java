import java.util.Scanner;

public class digit {
    public static void main(String args[]){
     Scanner sc =new Scanner(System.in);
    System.out.print("enter a no ");
    int num=sc.nextInt();
    int hundred=num/100;
    int tens=(num/10)%10;
    int ones=num%10;
    System.out.println(hundred);
    System.out.println(tens);
    System.out.println(ones);
    }
}
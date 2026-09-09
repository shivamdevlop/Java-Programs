import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the first no: ");
    int a =sc.nextInt();
    System.out.print("enter the second no: ");
    int b =sc.nextInt();
    int c;
    c=a;
    a=b;
    b=c;
System.out.println("swap using third variable");
System.out.println(a);
System.out.println(b);
    a=a+b;
    b=a-b;
    a=a-b;
System.out.println("swap without using third variable");
System.out.println(a);
System.out.println(b);    
    }
}
import java.util.Scanner;
public class calculator{
    public static void main (String ags[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Calculator program");
        System.out.print("enter the first no ");
        double a=sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        System.out.print("enter the second no ");
        double b=sc.nextDouble();
        switch(operator){
            case '+': System.out.println(a+b);
                       break;
            case '-': System.out.println(a+b);
                       break;
            case '*': System.out.println(a+b);
                       break;
            case '/':
                if (b!= 0) {
                    System.out.println (a/b);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default: System.out.println("enter a valid operator");
         
        }

    }
}
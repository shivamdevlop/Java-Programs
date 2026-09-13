import java.util.Scanner;
public class greatest {
    public static void main (String ags[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first no ");
        int a=sc.nextInt();
        System.out.print("enter the Second no ");
        int b=sc.nextInt();
        if(a>b)
            System.out.println("first no is greater");
        else
            System.out.println("second no is greater");
    }
}

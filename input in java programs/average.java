import java.util.Scanner;
public class average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter three numbers ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
       int sum= n1+n2+n3;
       int average = sum/3;
       System.out.print(average);
    }
}

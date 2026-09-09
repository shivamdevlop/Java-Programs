import java.util.Scanner;
public class boysandgirls {
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.print("enter the total students: ");
    int n=sc.nextInt();
    System.out.print("enter the total girls: ");
    int m=sc.nextInt();
    int boys=n-m;
    System.out.println("enter the total boys80: ");
    System.out.println(boys);
    double perg=(double)m/n*100;
    double perb=(double)boys/n*100;
    System.out.println(perg);
    System.out.println(perb);
    }
}

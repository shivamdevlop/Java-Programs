import java.util.Scanner;

public class squarediagonal{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the diagonal of square ");
    double diagonal=sc.nextDouble();
    double side = diagonal / Math.sqrt(2);
    double area=side*side;
    double perimeter=4*side;
    System.out.println(area);
    System.out.println(perimeter);
    }
}
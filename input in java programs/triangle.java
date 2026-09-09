import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("enter perpendicular ");
       int perpendicular=sc.nextInt();
    System.out.print("enter base ");  
       int base =sc.nextInt();
       double hypotenuse = Math.hypot(perpendicular, base);
       double area=0.5*perpendicular*base;
       double perimeter=perpendicular+base+hypotenuse;
    System.out.println(area);
    System.out.println(perimeter);
    }
}
import java.util.Scanner;
public class twodigit{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the tens digit ");
    int tens=sc.nextInt();
    System.out.print("enter the unit digit ");
    int unit=sc.nextInt();
    int org= (10 * tens) + unit;
    int rev= (10 * unit) + tens;
    int value= (org + rev) / (tens - unit);
    System.out.println(value);
    }
}
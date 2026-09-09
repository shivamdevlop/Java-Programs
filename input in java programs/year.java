import java.util.Scanner;
public class year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totaldays,years,month,days;
    System.out.print("enter total no of days ");
        totaldays=sc.nextInt();
        years=totaldays/365;
        totaldays=totaldays%365;
        month=totaldays/30;
        days=totaldays%30;
        System.out.println(years);
        System.out.println(month);
        System.out.println(days);
    }
}

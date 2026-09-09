import java.util.Scanner;
public class employee {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your salary: ");
        double salary=sc.nextInt();
        double providentfund=salary*12/100;
        double remsal=salary-providentfund;
        double houserent=remsal*10/100;
        double education=remsal*20/100;
        System.out.println(providentfund);
        System.out.println(houserent);
        System.out.println(education);
}
}

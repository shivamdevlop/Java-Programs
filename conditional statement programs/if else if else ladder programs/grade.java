import java.util.Scanner;
public class grade{
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the marks ");
        int marks=sc.nextInt();
        if(marks>=90)
           System.out.print("grade A");
        else if(marks>=70)
           System.out.print("grade B");
        else if(marks>=40)
           System.out.print("grade C");
        else
           System.out.print("grade D"); 
    }
}
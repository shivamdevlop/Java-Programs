import java.util.Scanner;
public class maxmin{
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first no ");
        int a=sc.nextInt();
        System.out.print("enter the second no ");
        int b=sc.nextInt();
        System.out.print("enter the third no ");
        int c=sc.nextInt();
        int min,max;
        if(a>b&&a>c)
            max=a;
        else if(b>c&&b>a)
            max=b;
        else
            max=c;
        if(a<b&&a<c)
            min=a;
        else if(b<c&&b<a)
            min=b;
        else
            min=c;
        System.out.println(max);
        System.out.println(min);
    }
}
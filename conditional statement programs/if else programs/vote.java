import java.util.Scanner;
public class vote {
    public static void main (String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.print("enter a num ");
    int age=sc.nextInt();
    if(age>=18){
        System.out.println("eligible to vote");
    }else{
        System.out.println("not elegible to vote");
    }
    }
}

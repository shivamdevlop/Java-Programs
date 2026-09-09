import java.util.*;
public class rationalno {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the first no: ");
    int first=sc.nextInt();
    System.out.print("enter the second no: ");
    int second=sc.nextInt();
    double secondrational=(first+second)/2.0;
    double firstrational=(first+secondrational)/2.0;
    double thirdrational=(second+secondrational)/2.0;
    System.out.println(firstrational);
    System.out.println(secondrational);
    System.out.println(thirdrational);
    }
}

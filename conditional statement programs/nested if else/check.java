import java.util.*;
public class check{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter first no ");
int a=sc.nextInt();
System.out.print("enter second no ");
int b=sc.nextInt();
if(a>b){
    System.out.print("enter a number ");
    int num=sc.nextInt();
  if(num%2==0){
     System.out.print("even no");
  }else{
     System.out.print("odd no");
  }
}else{
    System.out.print("enter a no ");
    int num=sc.nextInt();
 if(num%7==0||num%10==7){
     System.out.print("buzz no");

 }else{
    System.out.print("not a buzz no");
 }
}
    }
}
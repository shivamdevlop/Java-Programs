public class tribonacci{
    public static void main(String[] args) {
       int a=0,b=1,c=1,n=10,d;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
    }
}
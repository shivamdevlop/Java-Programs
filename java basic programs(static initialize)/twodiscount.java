public class twodiscount {
    public static void main(String[] args) {
        double markedprice=7200;
        double firstdiscount=markedprice*20/100;
        double afterprice=markedprice-firstdiscount;
        double seconddiscount=afterprice*10/100;
        double sellingprice=afterprice-seconddiscount;
        double totaldiscount=markedprice-sellingprice;
         System.out.println(markedprice);
         System.out.println(sellingprice);
         System.out.println(totaldiscount);
    }
}

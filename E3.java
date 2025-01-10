// Exception handling
class E3{
   public static void main(String args[]){
      System.out.println(" Hello ... hii ");
    int a, b, c=0;
  a= 10;
  b= 2;
    System.out.println(" before exception  ");
try{
   System.out.println(" Enter try");
  c = a/b;
System.out.println(" Exit try");
 }
catch(ArithmeticException ae){
      System.out.println(" This is catch block ");
     System.out.println(" Denomenator should not be zero");
}

  System.out.println( c);
 System.out.println(" Hello ... bye ");
 System.out.println("after exception");

}
}

// Exception handling
class E4{
   public static void main(String args[]){
      System.out.println(" Hello ... hii ");
    int a, b, c=0;
  a= 10;
  b= 0;
    System.out.println(" before exception  ");
try{
   System.out.println(" Enter try");
  c = a/b;
System.out.println(" Exit try");
 }
finally{
      System.out.println(" This is finally block");
     
}

  System.out.println( c);
 System.out.println(" Hello ... bye ");
 System.out.println("after exception");

}
}

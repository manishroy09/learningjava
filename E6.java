class E6{
  public static void main(String args[]){
     int n=0 ;
    try{
    n = Integer.parseInt(args[0]);
     if(n<0){
      NegativeException x=new NegativeException("Negative Number Exception Occur");
    throw x;
}
    }
   catch(ArrayIndexOutOfBoundsException ae){
    System.out.println("Please Enter At Least Argument from command line");
   }
  catch(NegativeException y){
     System.out.println(y.getMsg());
   }

   catch(NumberFormatException ne){
    System.out.println("Please Enter Only Numeric value");
    }
   System.out.println("Square is  :" +Math.pow(n,2));
 }

}
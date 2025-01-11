// command line argument and multiple catch 

class E5{
  public static void main(String args[]){
     int n=0 ;
    try{
    n = Integer.parseInt(args[0]);
    }
   catch(ArrayIndexOutOfBoundsException ae){
    System.out.println("Please Enter At Least Argument from command line");
   }

   catch(NumberFormatException ne){
    System.out.println("Please Enter Only Numeric value");
    }
   System.out.println("Square is  :" +Math.pow(n,2));
 }

}
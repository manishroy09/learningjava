import java.util.Scanner;
   class trim1{
      public static void main(String args []){
       Scanner sk=new Scanner(System.in);
       System.out.println("Enter any String :");
       String s=sk.nextLine();
      System.out.println("Length of string before trim :" +s.length());
      String s1=s.trim();
     System.out.println("Length of string after trim :" +s1.length());
  }
}
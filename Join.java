import java.util.Scanner;
 class Join{
   public static void main (String args[]){
    Scanner sk=new Scanner (System.in);
    
    System.out.println("Enter any String :");
    String s=sk.nextLine();

   String arr[]=s.split(" ");
 
   String s2= String.join(":" , arr);

   System.out.println(s2);

  }

}
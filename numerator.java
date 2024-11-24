import java.util.Scanner;
 public class numerator{
       public static void main(String args[]){
      int num,den;
      Scanner de=new Scanner(System.in);
     System.out.println(" Enter Numerator  : ");
     num=de.nextInt();
     System.out.println(" Enter Denomirator : ");
     den=de.nextInt();
      
  
   int qu=num/den;
   int re=num%den;
  
  System.out.println("Quotient : "+qu);
  System.out.println("Reminder  : "+re);



}
}
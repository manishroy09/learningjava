// to check which one string in greater on the basis of character
import java.util.Scanner;
class s5{
    public static void main(String args[]){

     Scanner sk=new Scanner(System.in);
    System.out.println("Enetr String 1 :");
      String s1=sk.nextLine();
      System.out.println("Enetr String 2 :");
       String s2=sk.nextLine();

    int x=s1.compareTo(s2);
   if(x>0){
    System.out.println(s1+ " is Greater ");
   }
    else if(x<0){
    System.out.println(s2+ " is Greater ");
   }
     if(x==0){
    System.out.println(s1+ "and" +s2+ " is equal ");
   }

  }
}
 
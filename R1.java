// to calculate factorial using recursion
import java.util.Scanner;
class R1{
     int fact(int n){
     if(n==1){
       return 1;
     }
      else {
         return n*fact(n-1);
       }

  }

   public static void main(String args[]){
     
   
    Scanner sk=new Scanner(System.in);
    System.out.println("Enter any number :");
    int n=sk.nextInt();
   
    R1 x=new R1();
    int f= x.fact(n);

    System.out.println(f);
}

}

    
//to check given no. is strong number or Krishnamurthy number.
// no. in which sum of the factorial of  digit is equal to the no.
import java.util.Scanner;
     public class l22{
          public static void main(String args[]){
          Scanner sk=new Scanner(System.in);
          System.out.println(" Enter any number ");
          int n=sk.nextInt();

      
      int fact=1;
       int sum=0;
        int m=n;
       while(n!=0){
        int r=n%10;
        for(int i=r; i>=1; i--){
         
           fact=fact*i;
           }
        sum=sum + fact;
        n=n/10;
         }
      if(m==sum){
       System.out.println(" This is Krishnamurthy number " );
      }
       else{
          System.out.println(" This is not a Krishnamurthy number " );
           }
        }
}
           
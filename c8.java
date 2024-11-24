// task 
import java.util.Scanner;
    public class c8{
       public static void main(String args[]){
       Scanner sk=new Scanner(System.in);

       int n,i,o;
          System.out.println("Input number of terms is :");
          n=sk.nextInt();
       int count=0;
       int sum=0;
      for(i=1; count<n ;i++){
       
       if(i%2!=0){
          System.out.println(i);
       sum=sum+i;
         count++;
         }
          
        }
           System.out.println("The sum of odd natural number upto " +n+ "terms is " +sum);  
     
        }
}
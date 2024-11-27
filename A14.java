// write program to convert given number to binary number
import java.util.Scanner;
   class A14{
       public static void main(String args[]){
       Scanner sk=new Scanner(System.in);

       System.out.println(" Enter any number ");
       int n=sk.nextInt();


      int arr[]=new int[n];
      
     int i=0;
     while(n>0){
     int r=n%2;
     arr[i]=r;
     i++;
     n=n/2;
    }
  System.out.print( "Binary of the number is : ");
  for(i=i-1; i>=0; i--){
    System.out.print( "\t" +arr[i]);
   }
 }
} 
    

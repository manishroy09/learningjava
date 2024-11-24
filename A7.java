//to print alternate array  element starts with 0 index 
import java.util.Scanner; 
 class A7{
   public static void main( String args []){
    int arr[]= new int[5];

    Scanner sk=new Scanner(System.in);
     int i;
    for( i=0; i<arr.length; i++){
    System.out.println("Element of index  "+i+"  : " );
    arr[i]=sk.nextInt();
     }   
    System.out.println(" Length of array " +arr.length);
     
    System.out.println(" Element of array : ");

    for ( i=0; i<arr.length; i=i+2){
    
             System.out.println(i+ " Index Element " +arr[i]);
      }
    }

}
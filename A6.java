// to print reverse of the array element 
//  to initialize array without
import java.util.Scanner; 
 class A6{
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

    for ( i=arr.length-1; i>=0; i--){
    
             System.out.println(i+ " Index Element " +arr[i]);
      }
    }

}
/* write a java program to take array elements from the user and print it on screen */
import java.util.Scanner; 
 class A4{
   public static void main( String args []){
    int arr[]= new int[5];

    Scanner sk=new Scanner(System.in);

    System.out.println("Element at index 0 : " );
    arr[0]=sk.nextInt();
    System.out.println("Element at index 1 : " );
    arr[1]=sk.nextInt();
    System.out.println("Element at index 2 : " );
    arr[2]=sk.nextInt();
    System.out.println("Element at index 3 : " );
    arr[3]=sk.nextInt();
    System.out.println("Element at index 4 : " );
    arr[4]=sk.nextInt();

    

     

    System.out.println(" Array Element index of 0 : " +arr[0]);
    System.out.println(" Array Element index of 1 : " +arr[1]);
    System.out.println(" Array Element index of 2 : " +arr[2]);
    System.out.println(" Array Element index of 3 : " +arr[3]);
    System.out.println(" Array Element index of 4 : " +arr[4]);
   
    System.out.println(" Length of array " +arr.length);

    }

}
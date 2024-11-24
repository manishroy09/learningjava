//to print sum of all array elemant


import java.util.Scanner; 
 class A9{
   public static void main( String args []){
    int arr[]= new int[5];

    Scanner sk=new Scanner(System.in);
     int i;
     int sum=0;
    for( i=0; i<arr.length; i++){
    System.out.println("Element of index  "+i+"  : " );
    arr[i]=sk.nextInt();
     }   
    System.out.println(" Length of array " +arr.length);
     
    System.out.println(" sum of element of array  : ");

    for ( i=0; i<arr.length; i++){
         sum=sum+arr[i];    
      }
       System.out.println(sum);
    }

}
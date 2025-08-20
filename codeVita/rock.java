import java.util.*;
public class rock{
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int s, r;
   System.out.println("Enter no. of Sample :");
   s = sc.nextInt();
   System.out.println("Enter no. of Range :");
   r = sc.nextInt();
   int a[] = new int[s];

   System.out.println("Enter size of sample");
  for(int i=0; i<s; i++){
    a[i] = sc.nextInt();
    }
   for(int i=0; i<r; i++){
     System.out.println("Enter min and max of the range ");
     int min = sc.nextInt();
     int max = sc.nextInt();
     int count = 0;
    for(int j=0; j<s; j++){
       if(a[j]>min && a[j]<max){
       count++;
       }
     }
   System.out.println(count);
   }
 }
}

   
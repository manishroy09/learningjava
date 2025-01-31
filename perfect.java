// perfect number : number whose sum of divisor is equal to that number.


import java.util.Scanner;

public class perfect{
 
  public static void main(String args[]){
  Scanner sk = new Scanner(System.in);

  System.out.println("Enter any number");
  int n=sk.nextInt();

  int sum=0;

for(int i=1; i<=n/2; i++){
  if(n%i==0){
     sum+=i;
    }
  }
if(sum==n){
   System.out.println(n+" is perfect number");
  }else{
    System.out.println(n+" is not a perfect number");
  }

}
}
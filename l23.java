// to print prime number or not 
import java.util.Scanner;
    class l23{
        public static void main(String args[]){
        Scanner sk=new Scanner(System.in);
    
        System.out.println("Enter any number ");
        int n=sk.nextInt();

     int count=0;
     for(int i=1;i<=n;i++){
             if(n%i==0){

        count++;
         }
     }

  if(count==2){
       System.out.println("Prime number ");
       }
        else {
            System.out.println(" Not a Prime number");
          }
}
}
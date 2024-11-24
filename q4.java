//task 
import java.util.Scanner;
     class q4{
        public static void main(String args[]){

       int n1,n2;
       Scanner e=new Scanner(System.in);
     
       System.out.println(" Enter number 1 ");
       n1=e.nextInt();
       System.out.println(" ENter number 2");
       n2=e.nextInt();


      switch((n1+n2)%2){
         case 0:
            System.out.println(" EVEN ");
          break;
         
         case 1:
            System.out.println(" ODD ");
           break;
      
        }
}
}

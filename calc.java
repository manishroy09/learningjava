import java.util.Scanner;
    public class calc{
           public static void main(String args[]){
            char c;
            int n1,n2;
           Scanner ca=new Scanner(System.in);

        System.out.println(" Enter choice ");
        System.out.println("===================");

        System.out.println(" press + for Addition ");
        System.out.println(" press - for Subtraction ");
        System.out.println(" press * for Multiplicatiion ");
        System.out.println(" press / for division ");
        System.out.println("===================");
        c=ca.next().charAt(0);
        System.out.println("===================");


      System.out.println(" Enter number 1 ");
        n1=ca.nextInt();
     System.out.println(" Enter number 2 "); 
        n2=ca.nextInt();
        System.out.println("===================");

       if(c=='+'){
              System.out.println(" Addition : "+(n1+n2) );
       }
       else if(c=='-'){
             System.out.println("Subtraction :" +(n1-n2) );
         }
       else if(c=='*'){
           System.out.println("Multiplication :" +(n1*n2));
     }
     else if(c=='/'){
           System.out.println("division : "+(n1/n2));
     }
    else{
     System.out.println("Invalid choise");
     }
     System.out.println("===================");
}
}
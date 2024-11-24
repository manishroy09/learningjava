// print no. which  is divisible by 3 and 5 till 60 using do while,
public class l12{
       public static void main(String args[]){

     int n=1;
        do{
             if(n%3==0 && n%5==0){
             System.out.println(n);
              }        
         n++;
      }while(n<=60);

     }
}
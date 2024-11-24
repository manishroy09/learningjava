import java.util.Scanner;
class leetcode1{
        public static void main(String args[]){
        
       Scanner sk=new Scanner(System.in);
       int num1=sk.nextInt();
       int num2=sk.nextInt();



int oper=0;
while(num1>0 &&num2>0){
   if(num1>=num2){
         num1=num1-num2;
         num2=num2;
          }
      else{
          num2=num2-num1;
          num1=num1;
        }
     oper=oper+1;
}
 if(num1==0 || num2==0){
          System.out.println(oper);
        }
 }
}
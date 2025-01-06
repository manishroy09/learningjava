// String task 3 -- Question no.5

import java.util.Scanner;
class st35{
   public static void main(String args[]){
     
   Scanner sk=new Scanner(System.in);

   System.out.println("Enter String 1 :");
   String s=sk.nextLine();

    char arr[] = s.toCharArray();
     
   for(int i=0; i<s.length(); i++){
       
       for(int j=i+1; j<s.length(); j++){
              
           if(arr[i]>arr[j]){
             char temp =arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
                         } 
          }
              
         
     }
for(char x:arr){
 System.out.print(x);
}
   
 }

}
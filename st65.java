// string based task 6 --- question no 5

import java.util.Scanner;

class st65{
   public static void main(String args[]){
    Scanner sk = new Scanner(System.in);


    System.out.println("Enter any string :");
    String s = sk.nextLine();
    
    
    char arr[] = s.toCharArray();

    for(int i=0; i<arr.length-1; i+=2){
       char temp = arr[i];
           arr[i] = arr[i+1];
           arr[i+1] = temp;
          
  }

    System.out.println(arr);
   
}

}
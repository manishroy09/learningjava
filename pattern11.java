//to print pattern
class pattern11{
     public static void main(String args []){

     int r,c; 
     

     for(r=5;r>=1;r--){
           for(c=1;c<=r;c++){

                   System.out.print((char)(64+r));// called type casting
                }
           System.out.println(" ");
         }
    }
  }
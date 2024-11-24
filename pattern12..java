//to print pattern
class pattern12{
     public static void main(String args []){

     int r,c; 
     int n=64;

     for(r=1;r<=5;r++){
           for(c=1;c<=r;c++){

                   System.out.print((char)(n+r));// called type casting
                }
           System.out.println(" ");
         }
    }
  }
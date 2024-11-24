//to print pattern
class pattern9{
     public static void main(String args []){

     int r,c; 
     int n=16;
     for(r=5;r>=1;r--){
           for(c=1;c<=r;c++){
               n--;
               System.out.print(" " +n);
                           }
           System.out.println(" ");
         }
    }
  }
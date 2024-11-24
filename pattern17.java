
//to print pattern  like primadi
class pattern17{
     public static void main(String args []){

     int r,c; 
     
     for(r=1;r<=5;r++){
            for( c=5; c>r; c--){
 
              System.out.print( " ");
               }

           for(c=1;c<=2*r-1;c++){
            
            System.out.print("*");
               
             }
          
           System.out.println(" ");
         }
    }
  }
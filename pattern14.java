//to print pattern  alternate of pattern 13
class pattern14{
     public static void main(String args []){

     int r,c; 
     
     for(r=1;r<=5;r++){
           for(c=1;c<=r;c++){
             
            System.out.print((r+c)%2);
                
}
           System.out.println(" ");
         }
    }
  }
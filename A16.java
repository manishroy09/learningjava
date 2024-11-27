//write a program to short array in decending  order 
class A16{
   public static void main(String args[]){

   int arr[]={30,10,20,50,40,100,90,60,80,70};

   System.out.println("Before sorting ");
   for(int i=0; i<arr.length ; i++){
   System.out.print("\t" +arr[i]);
   }
// bubble short logic 


  for(int i=0; i<arr.length; i++){
       for(int j=i+1; j<arr.length; j++){
            if(arr[i]<arr[j]){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
           }
       }
   }



System.out.println(" \nAfter sorting ");
   for(int i=0; i<arr.length ; i++){
   System.out.print("\t" +arr[i]);
   }
}
}
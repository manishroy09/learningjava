// write a java program to check given array is shorted or not;
  
 
class A18{
   public static void main(String args[]){

   int arr[]={10,5,6,20};

  int count=0;
   for(int i=0; i<arr.length; i++){
      for(int j=i+1; j<arr.length-1; j++){
        if(arr[i]>arr[j]){
          count++;
            }
         }
        }
    if(count==0){
        System.out.println(" yes it is shorted array");
        }
     else{
         System.out.println(" No it is not  shorted array");
   }
}
}

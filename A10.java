// to find smallest element of array
class A10{
     public static void main(String args[]){
     int arr[]={100,1,200,2,300,0,-1};
     int min=arr[0];

   for(int i=0; i<arr.length; i++){
      if(arr[i]<min){
        min=arr[i];
        }
    }
      System.out.println(" Smallest Element : " +min);
     }
 }
 
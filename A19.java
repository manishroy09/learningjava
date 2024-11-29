//write a java program o find unique element

class A19{
    public static void main(String args[]){
    int arr[]={1,2,3,1,2,3,4,5,6,7,8,9};
    int freq[]=new int[10];

    for(int i=0; i<arr.length; i++){
       freq[arr[i]]++;
     }
  System.out.println(" Unique element of array : ");

for(int i=0; i<freq.length; i++){
    if(freq[i]==1){
    System.out.print("\t"+i);
    }
  }

System.out.println("\n Duplicate element of array  : ");

for(int i=0; i<freq.length; i++){
    if(freq[i]>1){
    System.out.print("\t"+i);
    }
  }
}
}

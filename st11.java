//string task1
class st11{
     public static void main(String args[]){
       String s="Betty got a bit of bitter better butter";
 
     String s1=s.toLowerCase();
     System.out.println("print all occurrences index of b and t");
for(int i=0 ; i<s1.length(); i++){
     if(s1.charAt(i)=='b'){
     System.out.print("\t" +i);
    }
     if(s1.charAt(i)=='t'){
     System.out.print("\t" +i);
    }
    }
    System.out.println(" ");
    
    System.out.println(" print each word along with its length");
  
  String arr[]=s.split(" ");
   
   System.out.println(arr[0]+ " length is -"+arr[0].length());
   System.out.println(arr[1]+ " length is -"+arr[1].length());
   System.out.println(arr[2]+ " length is -"+arr[2].length());
   System.out.println(arr[3]+ " length is -"+arr[3].length());
   System.out.println(arr[4]+ " length is -"+arr[4].length());
   System.out.println(arr[5]+ " length is -"+arr[5].length());
   System.out.println(arr[6]+ " length is -"+arr[6].length());
   System.out.println(arr[7]+ " length is -"+arr[7].length());

}
}

    
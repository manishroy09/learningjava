// program to update all the vowel by Z in the given String
 class Sb7{
     public static void main(String args[]){

        StringBuffer s=new StringBuffer("welcome");
        System.out.println(s);

    for(int i=0; i<s.length(); i++){
      char c=s.charAt(i);

      if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'){

        s.setCharAt(i,'Z');
      }
     }
        System.out.println(s);
}
}
  
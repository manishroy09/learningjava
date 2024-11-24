import java.util.Scanner;
 public class problem5{
        public static void main(String args[]){
        String name ;
        char S;
        int M;
        int C;
        int P;
        int H;
        int E;
        int T;
        float Per;
 
       Scanner R=new Scanner(System.in);
       System.out.println( " Enter name :");
       name=R.nextLine();
       System.out.println(" Enter Section :");
       S=R.next().charAt(0);
       System.out.println(" Enter Maths Marks :");
       M=R.nextInt();
       System.out.println(" Enter Chemistry Marks :");
       C=R.nextInt(); 
       System.out.println(" Enter Physics Marks :");
       P=R.nextInt();
       System.out.println(" Enter Hindi  Marks :");
       H=R.nextInt();
       System.out.println(" Enter English Marks :");
       E=R.nextInt();
      


     T=M+C+P+H+E;
     Per=T/5.0f;

    System.out.println("Name :"+name);
    System.out.println("Section :"+S);
    System.out.println("Maths Marks :"+M);
    System.out.println("Chemistry Marks  :"+C);
    System.out.println("Physics Marks  :"+P);
    System.out.println("Hindi Marks  :"+H);
    System.out.println("English Marks  :"+E);
    System.out.println("Total Marks  :"+T);
    System.out.println("percentage :"+Per);

}

}


        
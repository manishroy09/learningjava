import java.util.Scanner;
public class manish{
	public static void main(String[] args) {
                int n1,n2;
		System.out.print("Enter one numbers ");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
                System.out.print("Enter Two numbers ");
                n2=sc.nextInt();
		int count=0;
                
     for(int i=n1;i<=n2;i++) {
       int div=0;
      	for(int j=1;j<=i;j++){
	     if(i%j==0){
                 div++;
              }
            } 
              if(div==2){
                 count++;    
                
		}	         
		           
                    
           }
 System.out.println(count);

}
}

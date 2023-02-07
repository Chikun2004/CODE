import java.util.Scanner;
public class prog1 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the first number: ");
       int a = sc.nextInt();
       System.out.print("Enter the second number: ");
       int b = sc.nextInt();
       int sum1=0,sum2=0,i,j;
       for(i=1;i<a;i++) {
    	   if(a%i==0)
    		   sum1+=i;
       }
       for(j=1;j<b;j++) {
    	   if(b%j==0)
    		   sum2+=j;
       }
       if(a==sum2 && b==sum1)
    	   System.out.println("amicable number");
       else
    	   System.out.println("not amicable number");

	}

}

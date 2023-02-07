import java.util.Scanner;
public class prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n,rev=0,a=0,d=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the prime number?");
     n = sc.nextInt();
       while(n>0) {
    	   rev=rev*10+n%10;
       n=n/10;
       }
	   for(int i=1;i<a;i++) {
		if(a%i==0)
			a++;
	}
	   for(int i=1;i<d;i++) {
			if(d%i==0)
				d++;
	   

}
	
	   if(a==2&& d==2) {
		   System.out.println("twisted prime ");
	  
	   }else {
		   System.out.println("a twisted prime");
	   }
}
}

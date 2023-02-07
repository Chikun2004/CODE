
public class prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a =4,b=15,c=0;
          for(int i=a;i<=b;i++) 
          {
        	  for(int j=1;j<=i;j++) 
        	  {
        		  if(i%j==0)
        		  c++;
        	  }
        	  if(c==2) {
        		  System.out.println(i);
        		  }
        		  c=0;
        	  }
          }
}



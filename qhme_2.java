import java.util.Scanner;
public class qhme_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of eggs :");
         int eggs= sc.nextInt();
         //calculate the number of dozens
         int dozens= eggs /12;
         //calculate the numbe of extra eggs
         int extra=eggs%12;
         //calculate the number  of gross
         int gross=eggs/144;
         //calculate the number of eggs left over ater gross;
         int leftover = eggs %144;
         System.out.println("your number of eggs is "+gross+"gross ,"+dozens +"dozens ,and "+extra+" . ");
	
        		 
        		 
        		 
        		 
        		 
	}

}

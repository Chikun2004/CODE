import java.util.Scanner;
public class Qhme_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of minutes");
        long minutes = sc.nextLong();
        //calculate the number of years
        long years = minutes/525600;
        //calculate the number of days
        long days = (minutes % 525600)/ 1440;
        //
        //
        //
        System.out.println(minutes + " minutes is aproximately " + years +" years and " + days +"days.");
        
        
        
	}

}

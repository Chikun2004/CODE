import java.util.Scanner;
public class qhme_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three points for a triangle"); 
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
      
        double A =(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
        double AB =Math.pow(A, 0.5);
        double B =(x3-x2)*(x3-x2)+(y3-y2)*(y3-y2);
        double BC=Math.pow(B, 0.5);
        double C =(x3-x1)*(x3-x1)+(y3-y1)*(y3-y1);
        double CA =Math.pow(C, 0.5);
        double s=(AB+BC+CA);
        double a=s*(s-AB)*(s-BC)*(s-CA);
        double area=Math.pow(a, 0.5);
        System.out.println("The area of the triangle is" + area);
        
	}

}

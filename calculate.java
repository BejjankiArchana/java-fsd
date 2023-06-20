package calculator;
import java.util.Scanner;

public class calculate {

	public static void main(String[] args) {
		// TO calculate sum, difference, product, division.5
		int n1,n2;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter first num:");
		n1=sc.nextInt();
		System.out.println("enter second num:");
		n2=sc.nextInt();
		System.out.println("addition of two numbers is:"+(n1+n2));
		System.out.println("subtraction of two numbers is:"+(n1-n2));
		System.out.println("multiplication of two numbers is:"+(n1*n2));
		System.out.println("division of two numbers is:"+(n1/n2));

	}

}

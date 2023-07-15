package Top_100_Codes;
import java.util.*;
public class Factorial {
	public static int Fact(int A) {
		int F=1;
		for(int i=1;i<=A;i++) {
			F=F*i;
		}
		return F;
	}
	public static void main(String[] args) {
		//Write a Java Program to find it's factorial of a number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to find it's Factorial: ");
		int N=sc.nextInt();
		System.out.println(Fact(N));
		sc.close();
	}

}

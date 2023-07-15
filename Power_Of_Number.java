package Top_100_Codes;
import java.util.*;
public class Power_Of_Number {
	public static int PowerOfNumber(int A, int B) {
		int Ans=(int)Math.pow(A, B);
		return Ans;
	}
	public static void main(String[] args) {
		// Write a Java Program to find it's Power of a number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Base Number: ");
		int N=sc.nextInt();
		System.out.println("Enter a Power Number: ");
		int M=sc.nextInt();
		System.out.println(PowerOfNumber(N,M));
		sc.close();

	}

}

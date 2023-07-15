package Top_100_Codes;
import java.util.*;
public class Sum_Of_Digits {
	public static int SumOfDigits(int A) {
		int sum=0;
		while(A!=0) {
			int digit=A%10;
			sum=sum+digit;
			A=A/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		//Write a Java Program to find the sum of the digits of a number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to get it's sum: ");
		int A=sc.nextInt();
		System.out.println(SumOfDigits(A));
		sc.close();

	}

}

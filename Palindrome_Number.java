package Top_100_Codes;
import java.util.*;
public class Palindrome_Number {
	public static boolean Palindrome(int A) {
		int Rev=0;
		int B=A;
		while(A!=0) {
			int digit=A%10;
			Rev=Rev*10+digit;
			A=A/10;
			
		}
		if(Rev==B) {
			
			return true;
		}

		return false;
	}
	public static void main(String[] args) {
		// Write a Java Program to find it is Palindrome or Not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to check whether it is Palindrome or Not: ");
		int N=sc.nextInt();
		if(Palindrome(N)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
		sc.close();
	}

}

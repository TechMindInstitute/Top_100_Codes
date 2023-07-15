package Top_100_Codes;
import java.util.*;
public class Prime_Not {
	public static boolean IsPrime(int A) {
		if(A==0 || A==1) {
			return false;
		}
		for(int i=2;i<A;i++) {
			if(A%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// Write a Java Program to check whether the given number is Prime or Not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to check whether it Prime or Not: ");
		int N=sc.nextInt();
		if(IsPrime(N)) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not a Prime");
		}
		sc.close();

	}

}

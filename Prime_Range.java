package Top_100_Codes;
import java.util.*;
public class Prime_Range {
	public static boolean IsPrime(int N) {
		if(N==0 || N==1) {
		return false;
	}
		for(int i=2;i<N;i++) {
			if(N%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		//Write a Java Program to get the Prime numbers from one number to another number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to get Prime numbers from: ");
		int A=sc.nextInt();
		System.out.println("Enter a Number to get Prime numbers upto: ");
		int B=sc.nextInt();
		for(int i=A;i<B;i++) {
			if(IsPrime(i)) {
				System.out.println(i);
			}
		}
		sc.close();

	}

}

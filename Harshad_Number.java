package Top_100_Codes;
import java.util.*;
public class Harshad_Number {
	public static boolean Harshad(int N) {
		int A=N;
		int sum=0;
		while(N!=0) {
			int digit=N%10;
			sum=sum+digit;
			N=N/10;
		}
		if(A%sum==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		//Write a Java Program to check whether it is Harshad Number or Not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to check it is Harshad Number or Not: ");
		int K=sc.nextInt();
		if(Harshad(K)) {
			System.out.println("Harshad Number");
		}
		else {
			System.out.println("Not a Harshad Number");
		}
		sc.close();
	}

}

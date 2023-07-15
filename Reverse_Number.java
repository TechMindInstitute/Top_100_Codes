package Top_100_Codes;

import java.util.Scanner;

public class Reverse_Number {
	public static int Reverse(int A) {
		int Rev=0;
		while(A!=0) {
			int digit=A%10;
			Rev=Rev*10+digit;
			A=A/10;
		}
		return Rev;
	}
	public static void main(String[] args) {
		//Write a Java Program to reverse a Number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to find it's Reverse: ");
		int N=sc.nextInt();
		System.out.println(Reverse(N));
		sc.close();
		

	}

}

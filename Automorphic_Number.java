package Top_100_Codes;
import java.util.*;
public class Automorphic_Number {
	public static boolean Automorphic(int A) {
		int B=A;
		int Ans=(int)Math.pow(A, 2);
		int count=0;
		while(A!=0) {
			A=A/10;
			count++;
		}
		int Sol=0;
		while(count!=0) {
			count--;
			int digit=Ans%10;
			Sol=Sol*10+digit;
		}
		if(Sol==B) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		//Write a Java Program to find it is Automorphic or not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to check whether it is Automorphic Number or Not: ");
		int N=sc.nextInt();
		if(Automorphic(N)) {
			System.out.println("Automorphic Number");
		}
		else {
			System.out.println("Not an Automorphic Number");
		}
		for(int i=1;i<=100;i++) {
			if(Automorphic(i)) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}

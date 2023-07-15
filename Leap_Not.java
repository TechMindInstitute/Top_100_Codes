package Top_100_Codes;
import java.util.*;
public class Leap_Not {
	public static boolean Leap(int A) {
		if(A%4==0 && A%100!=0 || A%400==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// Write a Java Program to check whether the given year is Leap or Not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year to check whether the given year is Leap or Not: ");
		int N=sc.nextInt();
		if(Leap(N)) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not a Leap Year");
		}
		sc.close();

	}

}

package Top_100_Codes;
import java.util.Scanner;
public class Positive_Not {
	public static boolean PositiveOrNot(int A) {
		if(A>=0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		//Write a Java Program to check whether the given number is Positive or Not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to check  whether the given number is Even or Not: ");
		int N=sc.nextInt();
		if(PositiveOrNot(N)) {
			System.out.println("Positive Number");
		}
		else {
			System.out.println("Negative Number");
		}
		sc.close();
	}

}

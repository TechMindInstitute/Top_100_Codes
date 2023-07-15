package Top_100_Codes;
import java.util.*;
public class Even_Odd {
	
	public static boolean EvenOrNot(int A) {
		if(A%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		//Write a Java Program to check whether the given Number is Even or Odd
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to check whether the given number is Even or Odd: ");
		int N=sc.nextInt();
		if(EvenOrNot(N)) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		sc.close();

	}

}

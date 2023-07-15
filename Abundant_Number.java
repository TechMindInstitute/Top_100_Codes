package Top_100_Codes;
import java.util.*;
public class Abundant_Number {
	public static boolean Abundant(int A) {
		int sum=0;
		for(int i=1;i<A;i++) {
			if(A%i==0) {
				sum=sum+i;
			}
		}
			if(sum>A) {
				return true;
			
		}
		return false;
	}
	public static void main(String[] args) {
		//Write a Java Program to find it is Abundant Number or Not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to check whether it is Abundant or not: ");
		int N=sc.nextInt();
		sc.close();
		if(Abundant(N)) {
			System.out.println("Abundant Number");
		}
		else {
			System.out.println("Not an Abundant Number");
		}
	}

}

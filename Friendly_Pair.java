package Top_100_Codes;
import java.util.*;
public class Friendly_Pair {
	public static int FriendlyPair(int A) {
		int sum=0;
		for(int i=1;i<A;i++) {
			if(A%i==0) {
				sum=sum+i;
			}
		}
		return (sum/A);
	}
	public static void main(String[] args) {
		//Write a Java Program to check whether the given pair is Friendly Pair or not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		int N=sc.nextInt();
		System.out.println("Enter Number 2: ");
		int M=sc.nextInt();
		if(FriendlyPair(N)==FriendlyPair(M)) {
			System.out.println("Friendly Pair");
		}
		else {
			System.out.println("Not Friendly Pair");
		}
		sc.close();

	}

}

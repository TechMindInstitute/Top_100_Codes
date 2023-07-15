package Top_100_Codes;
import java.util.*;
public class Perfect_Number {
	public static boolean Perfect(int A) {
		int Ans=0;
		for(int i=1;i<A;i++) {
			if(A%i==0) {
				Ans=Ans+i;
			}
		}
		if(Ans==A) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		//Write a Java Program to find it's Perfect Number or Not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to check it's Perfect or Not");
		int N=sc.nextInt();
		if(Perfect(N)) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not a Perfect Number");
		}
		sc.close();
	}

}

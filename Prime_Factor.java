package Top_100_Codes;
import java.util.*;
public class Prime_Factor {
	public static boolean IsPrime(int A) {
		if(A==1) {
			return false;
		}
		for(int i=2;i<A;i++) {
			if(A%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void IsFactor(int A) {
		for(int i=2;i<=A;i++) {
			if(IsPrime(i)) {
				while(A%i==0) {
					System.out.println(i);
					A=A/i;
				}
			}
		}
	}
	public static void main(String[] args) {
		//Write a Java Program to find it's Prime Factor
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numberto get it's Prime Factors: ");
		int N=sc.nextInt();
		IsFactor(N);
		sc.close();

	}

}

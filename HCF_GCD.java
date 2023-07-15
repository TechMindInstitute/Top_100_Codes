package Top_100_Codes;
import java.util.*;
public class HCF_GCD {
	public static int HCFGCD(int A, int B) {
		int Ans=0;
		for(int i=1;i<A || i<B;i++) {
			if((A%i==0) && (B%i==0)) {
				Ans=i;
			}
		}
		return Ans;
	}
	public static void main(String[] args) {
		//Write a Java Program to find the GCD or HCF of 2 numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		int M=sc.nextInt();
		System.out.println("Enter Number 2: ");
		int N=sc.nextInt();
		System.out.println(HCFGCD(M,N));
		sc.close();

	}

}

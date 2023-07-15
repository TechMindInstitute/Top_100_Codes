package Top_100_Codes;
import java.util.*;
public class Armstrong_Range {
	public static boolean Armstrong(int A) {
		int B=A;
		int C=A;
		int count=0;
		while(C!=0) {
			C=C/10;
			count++;
		}
		int Ans=0;
		while(B!=0) {
			int digit=B%10;
			Ans=Ans+(int)Math.pow(digit,count);
			B=B/10;
		}
		if(A==Ans) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		//Write a Java Program to get the Armstrong numbers in between the range
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number 1: ");
		int N=sc.nextInt();
		System.out.println("Enter the Number 2: ");
		int M=sc.nextInt();
		for(int i=N;i<=M;i++) {
			if(Armstrong(i)) {
				System.out.println(i);
			}
			
		}
		sc.close();
	}

}

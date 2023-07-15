package Top_100_Codes;
import java.util.*;
public class Binary_To_Decimal {
	public static int Binary(int A) {
		
		int Ans=0;
		int count=0;
		while(A!=0) {
			int digit=A%10;
			Ans=Ans+digit*(int)Math.pow(2, count);
			A=A/10;
			count++;
		}
		return Ans;
	}
	public static void main(String[] args) {
		//Write a                                                                                             Java Program to convert Binary to Decimal
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Binary Number: ");
		int N=sc.nextInt();
		System.out.println(Binary(N));
		sc.close();

	}

}

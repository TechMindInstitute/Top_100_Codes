package Top_100_Codes;
import java.util.*;
public class Sum_In_Range {
	public static int SumInRange(int M,int N) {
		int Sum=0;
		for(int i=M;i<=N;i++) {
			Sum=Sum+i;
		}
		return Sum;
	}
	public static void main(String[] args) {
		// Write a Java Program to get the Sum of Numbers in the given range
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Starting Number: ");
		int A=sc.nextInt();
		System.out.println("Enter the Ending Number: ");
		int B=sc.nextInt();
		System.out.println(SumInRange(A,B));
		sc.close();
	}

}

package Top_100_Codes;
import java.util.*;
public class Sum_Of_N {
	public static int SumOfN(int N) {
		int Sum=0;
		for(int i=1;i<=N;i++) {
			Sum=Sum+i;
		}
		return Sum;
	}
	public static void main(String[] args) {
		//Write a Java Program to Sum the N Natural Numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to get the sum of the natural numbers upto: ");
		int N=sc.nextInt();
		System.out.println(SumOfN(N));
		sc.close();
	}

}

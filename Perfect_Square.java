package Top_100_Codes;
import java.util.*;
public class Perfect_Square {
	public static boolean PerfectSquare(int A) {
		for(int i=1;i<=A;i++) {
			int Ans=(int)Math.pow(i, 2);
			if(Ans==A) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		//Write a Java Program to check whether it is Perfect square or Not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to chec whether it is Perfect Square or not: ");
		int N=sc.nextInt();
		if(PerfectSquare(N)) {
			System.out.println("Perfect Square");
		}
		else {
			System.out.println("Not a Perfect Square");
		}
		sc.close();

	}

}

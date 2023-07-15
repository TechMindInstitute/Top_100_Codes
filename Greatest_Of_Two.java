package Top_100_Codes;
import java.util.*;
public class Greatest_Of_Two {
	public static int GreatestOfTwo(int M,int N) {
		if(M>N) {
			return M;
		}
		else {
			return N;
		}
	}
	public static void main(String[] args) {
		//Write a Java Program to find the Greatest among 2 numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number 1: ");
		int A=sc.nextInt();
		System.out.println("Enter the Number 2: ");
		int B=sc.nextInt();
		System.out.println("Largest Number is: "+GreatestOfTwo(A,B));
		sc.close();

	}

}

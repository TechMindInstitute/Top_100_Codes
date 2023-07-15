package Top_100_Codes;
import java.util.*;
public class Greatest_Of_Three {
	public static int GreatestOfThree(int M,int N,int O) {
		if(M>N && M>O) {
			return M;
		}
		else if(N>M && N>O) {
			return N;
		}
		else {
			return O;
		}
	}
	public static void main(String[] args) {
		//Write a Java Program to find the greatest among three numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number 1: ");
		int A=sc.nextInt();
		System.out.println("Enter the Number 2: ");
		int B=sc.nextInt();
		System.out.println("Enter the Number 3: ");
		int C=sc.nextInt();
		System.out.println("Largest Number is "+GreatestOfThree(A,B,C));
		sc.close();
	}

}

package Top_100_Codes;
import java.util.*;
public class LCM_Of_Two_Numbers {
	public static int LCM(int A, int B) {
		for(int i=2;i<=A*B;i++) {
			if((i%A==0) && (i%B==0)) {
				return i;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		//Write a Java Program to find LCM of 2 Numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		int N=sc.nextInt();
		System.out.println("Enter Number 2: ");
		int M=sc.nextInt();
		System.out.println(LCM(N,M));
		sc.close();
	}

}

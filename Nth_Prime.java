package Top_100_Codes;
import java.util.*;
public class Nth_Prime {
	public static boolean IsPrime(int A) {
		if(A<=1) {
			return false;
		}
		for(int i=2;i<A;i++) {
			if(A%i==0) {
				return false;
			}
		}
		return true;
	} 
	public static void main(String[] args) {
		// Write a Java Program to find Nth Prime Number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int N=sc.nextInt();
		int count=0;
		int j=1;
		while(count<=N) {
			if(IsPrime(j)) {
				count++;
			}
			if(count==N) {
				System.out.println(j);
				break;
			}
			j++;
		}
		sc.close();
	}

}

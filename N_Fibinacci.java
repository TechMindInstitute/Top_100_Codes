package Top_100_Codes;
import java.util.*; 
public class N_Fibinacci {

	public static void Fibinacci(int N) {
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<N-2;i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}

	}
	public static void main(String[] args) {
		// Write a Java Program to find the series of N Fibinacci numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to get upto N fibinacci series: ");
		int A=sc.nextInt();
		Fibinacci(A);
		sc.close();

	}

}

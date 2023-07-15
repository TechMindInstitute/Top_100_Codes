package Top_100_Codes;
import java.util.*;
public class Replace_0_1 {
	public static int Replace(int A) {
//		int B=A;
		int Ans=0;
		while(A!=0) {
			int digit=A%10;
			if(digit==0) {
				digit=1;
			}
			Ans=Ans*10+digit;
			A=A/10;
		}
		int Final=0;
		while(Ans!=0) {
			int digit=Ans%10;
			Final=Final*10+digit;
			Ans=Ans/10;
		}
		return Final;
	}
	public static void main(String[] args) {
		//Write a Java Program to replace 1's with 0's
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println(Replace(N));
		sc.close();

	}

}

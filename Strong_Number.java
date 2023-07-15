package Top_100_Codes;
import java.util.*;
public class Strong_Number {
	public static int Fact(int B) {
		int F=1;
		for(int i=1;i<=B;i++) {
			F=F*i;
		}
		return F;
	}
	public static boolean Strong(int A) {
		int B=A;
		int Ans=0;
		while(A!=0) {
			int digit=A%10;
			Ans=Fact(digit)+Ans;
			A=A/10;
		}
		if(Ans==B) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		//Write a Java Program to check whether it is Strong number or Not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int N=sc.nextInt();
		if(Strong(N)) {
			System.out.println("Strong Number");
		}
		else {
			System.out.println("Not a Strong Number");
		}
		sc.close();
	}

}

package Top_100_Codes;
import java.util.*;
public class Armstrong_Number {
	public static boolean Armstrong(int N) {
		int B=N;
		int C=N;
		int count=0;
		while(C!=0) {
			C=C/10;
			count++;
		}
		int Ans=0;
		while(N!=0) {
			int digit=N%10;
			Ans=(int)Math.pow(digit, count)+Ans;
			N=N/10;
		}
		if(Ans==B){
			return true;
		}	
		return false;
	}
	public static void main(String[] args) {
		//Write a Java Program to check whether it is Armstrong number or not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to check whether it is Armstrong or not");
		int A=sc.nextInt();
		sc.close();
		if(Armstrong(A)) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
	}

}

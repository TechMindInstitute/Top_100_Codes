package Top_100_Codes;
import java.util.*;
public class Largest_Array {
	public static int Largest(int Ar[]) {
		int Ans=0;
		for(int i=0;i<Ar.length;i++) {
			if(Ar[i]>Ans) {
				Ans=Ar[i];
			}
		}
		return Ans;
	}
	public static void main(String[] args) {
		//Write a Java Program to find the Largest of the Array
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int N=sc.nextInt();
		int Arr[]=new int[N];
		for(int i=0;i<N;i++) {
			Arr[i]=sc.nextInt();
		}
		System.out.println(Largest(Arr));
		sc.close();

	}

}

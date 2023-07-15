package Top_100_Codes;
import java.util.*;
public class Smallest_Array {
	public static int Smallest(int Ar[]) {
		int small=Ar[0];
		for(int i=0;i<Ar.length;i++) {
			if(Ar[i]<small) {
				small=Ar[i];
			}
		}
		return small;
	}
	public static void main(String[] args) {
		//Write a Java Program to find the Smallest element in the Array
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int N=sc.nextInt();
		int Arr[]=new int[N];
		for(int i=0;i<N;i++) {
			Arr[i]=sc.nextInt();
		}
		System.out.println(Smallest(Arr));
		sc.close();
	}

}

package Top_100_Codes;
import java.util.*;
public class Rev_Array {
	public static void main(String[] args) {
		//Write a Java Program to Reverse the Array
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array: ");
		int N=sc.nextInt();
		int Arr[]=new int[N];
		for(int i=0;i<N;i++) {
			Arr[i]=sc.nextInt();	
			}
//		for(int i=N-1;i>=0;i--) {
//			System.out.print(Arr[i]+" ");
//		}
		
		int Arr1[]=new int[N];
		for(int i=N-1 , j=0;i>=0;i--,j++) {
			Arr1[i]=Arr[j];
		}
		
		for(int i=0;i<N;i++) {
			System.out.println(Arr1[i]);
		}
		sc.close();		}
	}


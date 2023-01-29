package algorithms;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int element=sc.nextInt();
			int arr[] =new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int s=0;
			int e=n-1;
			int m=0;
			while(s<=e) {
				 m=(s+e)/2;
				if(element>arr[m]) {
					s=m+1;
				}else if(element<arr[m]) {
					e=m-1;
				}else if(element==arr[m]) {
					System.out.println(m);
					break;
	}
		}
			
			if(s>e) {
				System.out.println("element does not exist in the array");
			}
	}
}

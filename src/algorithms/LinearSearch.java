package algorithms;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("jhvjv");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int element=sc.nextInt();
		int arr[] =new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int j=0;
		for(j=0;j<n;j++) {
			if(element==arr[j]) {
				System.out.println(j);
				break;
			}
		}
		if(j>=n) {
			System.out.println("element does not exist");
		}
		
	}

}

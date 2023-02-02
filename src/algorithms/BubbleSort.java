package algorithms;

import java.util.Scanner;

public class BubbleSort {
public static int[] bubbleSort(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-i-1;j++) {
			if(arr[j+1]<arr[j]) {
				arr[j]=arr[j]+arr[j+1];
				arr[j+1]=arr[j]-arr[j+1];
				arr[j]=arr[j]-arr[j+1];
				arr[j] = arr[i];
			}
		}
	}
	return arr;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] =new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int[] output=bubbleSort(arr);
		for(int i=0;i<n;i++) {
			System.out.print(output[i]+ " ");
		}
	}

}

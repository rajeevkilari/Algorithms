package algorithms;
import java.util.Scanner;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s= new Scanner(System.in);
    int[] arr=new int[5];
    for(int n=0;n<arr.length;n++) {
    	arr[n]=s.nextInt();
    }
    for(int i=1;i<=arr.length-1;i++) {
    	int k=i;
    	for(int j=i-1;j>=0;j--) {
    		if(arr[k]<arr[j]) {
    			arr[k]=arr[k]+arr[j];
    			arr[j]=arr[k]-arr[j];
    			arr[k]=arr[k]-arr[j];
    		}
    		k--;
    	}
    }
    for(int l=0;l<=arr.length-1;l++) {
    	System.out.println(arr[l]);
    }
	}

}

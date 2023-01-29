package algorithms; 
import java.util.Scanner;
public class MergeSort {
public static void partition(int[] input) {
	if(input.length==1) {
return;
	}
	int s=0;
	int e=input.length-1;
	int m=(s+e)/2;
	int[] arr1=new int[m+1];
	for(int i=0;i<m+1;i++) {
		arr1[i]=input[i];
	}
	int[] arr2=new int[e-m];
	for(int j=0;j<e-m;j++) {
		arr2[j]=input[m+j+1];
	}
	partition(arr1);
	partition(arr2);
	merge(arr1,arr2,input);
}
	   public static void merge(int[]arr1,int[]arr2,int[]input) {
		   int i=0;
		   int j=0;
		   int k=0;
			   while(i<arr1.length && j<arr2.length) {
				   if(arr1[i]>arr2[j]) {
					   input[k]=arr2[j];
					   j++;
					  
				   }else {
					   input[k]=arr1[i];
					   i++;
				   }
				   k++;
			   }
			   while(i<arr1.length) {
				   input[k]=arr1[i];
				   i++;
				   k++;
				   }
			   while(j<arr2.length) {
				   input[k]=arr2[j];
				   j++;
                    k++;
			   }
	   }
	
	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	int n=s.nextInt();
    int[] input=new int[n];
    for(int i=0;i<input.length;i++) {
    	input[i]=s.nextInt();
    }
   partition(input);
   for(int i=0;i<input.length;i++) {
System.out.print(input[i] + " ");   }
	}

}

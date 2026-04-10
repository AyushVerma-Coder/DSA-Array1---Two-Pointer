package DSA;
//Squaring of array
//A={-3,-1,0,2,5}
//={9,1,0,4,25}
//={0,1,4,9,25}
//A is sorted

import java.util.Arrays;
import java.util.*;
//Two Pointer Solution. -  Optimal Solution.
public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-6,-1,0,2,5};
		int ans[]=new int[arr.length];
		int i=0;
		int j=arr.length -1;
		int k=arr.length -1;
		while (i<=j) {
			if (Math.abs(arr[i])>Math.abs(arr[j])) {
				ans[k]=arr[i]*arr[i];
				i++;
				
				
			}
			else {
				ans[k]=arr[j]*arr[j];
				j--;
			}
			k--;

		}
		System.out.println(Arrays.toString(ans));

	}

}

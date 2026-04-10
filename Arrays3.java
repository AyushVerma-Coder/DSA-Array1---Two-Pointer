package DSA;
//Two Sum addition of any two digits in an array
//A={2,5,7,8,12}
//Sum=15
//A is sorted.

import java.util.Arrays;
//Two Pointer Solution. - Optimal Solution
public class Arrays3 {
	public static void main(String[] args) {
		int arr[]= {2,5,7,8,12};
		int sum=15;
		int i=0;
		int j=arr.length-1;
		while (i<j) {
			if (arr[i]+arr[j]==sum) {
				System.out.println("Pair found: " + arr[i] + ", " + arr[j]);
				break;
			}
			else if((arr[i]+arr[j])<sum) {
				i++;
			}
			else {
				j--;
			}
		}
	}

}


import java.util.*;
/*
	Created by Sahil Diwan on 6th March 2017
	To find maximum array in an array using recursion
*/
class FindMax{
	public static void main(String[] args){
		int [] data = {2,1,4,7,6,32,97,5,4};
		int max;
		max = findMax(data, data.length - 1);
		System.out.println("Maximum no. is: " + max);
	}

	public static int findMax(int[] a, int n){
		if(n == 1){
			return a[0];
			}
			else{
				int t = findMax(a, n-1);
				if(t < a[n-1]){
					return a[n-1];
				}else{
					return t;
				}

			}	
	}
}
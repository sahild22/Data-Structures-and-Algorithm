/*
	Created by Sahil Diwan on 6th March 2017
	Insertion Sort Algorithm using Recursion
*/

class InsertionSort{

	public static void main(String[] args){
		int [] data = {2,1,4,7,6,32,97,5,4,1,};
		sort(data, data.length);
		printarr(data);
	}

	public static void sort(int[] a, int n){
		if(n == 1){
			return;
		}
		sort(a, n - 1);
		int j = n - 1;
		while(j > 0 && a[j] < a[j-1]){
			int tmp = a[j];
			a[j] = a[j - 1];
			a[j - 1] = tmp;
			j = j - 1;
		}
	}


	public static void printarr(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
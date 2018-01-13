/**
 *Rotate an array of n elements to the right by k steps.
 *For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] 
 *is rotated to [5,6,7,1,2,3,4]
**/

class RotateArray{
	public static void main(String[] args) {
		test(new int[]{1, 2, 3, 4}, 3);
		test(new int[]{1, 2, 3, 4, 5, 6}, 0);
		test(new int[]{1}, 3);
		test(new int[]{1, 2}, 3);
		test(new int[]{1, 2, 3}, 1);
	}

	public static void test(int[] arr, int k){
		System.out.println("Array before rotation: ");
		printArray(arr);
		System.out.println("K = " + k);
		System.out.println("Array after " + k + " right rotations");
		printArray(rotate(arr, k));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}


	public static int[] rotate(int[] arr, int k){
		int len = arr.length;
		if(k > len){
			k = k % len;
		}
		if(k < len && k > 0){
			//reverse full array first
			reverse(arr, 0, len - 1);
			//reverse first half
			reverse(arr, 0, k - 1);
			//reverse remaining half
			reverse(arr, k, len - 1);
		}
		return arr;
	}

	public static int[] reverse(int[] arr, int start, int end){
		while(start < end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		return arr;
	}

	public static void printArray(int[] arr){
		System.out.print("{" + arr[0]);
		for(int i = 1; i < arr.length; i++){
			System.out.print(", " + arr[i]);
		}
		System.out.println("}");
	}
}
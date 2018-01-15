/**
 *Given a sorted array, remove the duplicates in-place such that each element appear 
 *only once and return the new length.
 *Do not allocate extra space for another array, 
 *you must do this by modifying the input array in-place with O(1) extra memory.
 **/

class RemoveDuplicates{
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6};
		printArray(arr);
		System.out.println("Number of elements in new array = " + removeduplicate(arr));
		printArray(arr);
	}

	public static int removeduplicate(int[] arr){
		int count = 1;
		for(int i = 0; i < arr.length - 1; i++){
			if(arr[i] != arr[i+1]){
				arr[count] = arr[i+1];
				count++;
			}
		}
		return count;
	}

	public static void printArray(int[] arr){
		System.out.print("{" + arr[0]);
		for(int i = 1; i < arr.length; i++){
			System.out.print(", " + arr[i]);
		}
		System.out.println("}");
	}
}
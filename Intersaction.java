import java.util.ArrayList;
/**
 *Given two arrays, write a function to compute their intersection.
 *Example:
 *Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2]
**/
class Intersaction{
	public static void main(String[] args) {
		test(new int[]{1,2,2,1}, new int[]{2,2,1,1,5});
		test(new int[]{1}, new int[]{1});
	}

	public static void test(int[] arr1, int[] arr2){
		System.out.println("Array 1: ");
		printArray(arr1);
		System.out.println("Array 2: ");
		printArray(arr2);
		System.out.println("Intersaction: ");
		printArray(findIntersaction(arr1, arr2));
	}

	public static int[] findIntersaction(int[] arr1, int[] arr2){
		int count = 0;
		ArrayList<Integer> my_list = new ArrayList<>();
		my_list.add(90909090);
		ArrayList<Integer> result_list = new ArrayList<>();
		for(int i: arr1){
			my_list.add(i);
		}

		for(int j: arr2){
			if(my_list.contains(j)){
				result_list.add(j);
				my_list.remove(j);
				count++;
			}
		}

		int[] result = new int[count];
		int x = 0;
		for(int k : result_list){
			result[x] = k;
			x++;
		}
		return result;
	}

	public static void printArray(int[] arr){
		if(arr.length != 0){
			System.out.print("{" + arr[0]);
			for(int i = 1; i < arr.length; i++){
				System.out.print(", " + arr[i]);
			}
			System.out.println("}");
		}else{
			System.out.println("No value is common");
		}
	}
}
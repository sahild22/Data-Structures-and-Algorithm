import java.util.*;

class ContainsDuplicate{
	public static void main(String[] args) {
		System.out.println("O(n^2) implementation");
		System.out.println(checkDuplicateExpensive(new int[]{1, 2, 44, 3, 4, 5, 13, 0, 0}));
		System.out.println(checkDuplicateExpensive(new int[]{0}));
		System.out.println();
		System.out.println("O(n) implementation");
		System.out.println(checkDuplicateHashSet(new int[]{1, 2, 44, 3, 4, 5, 13, 0, 0}));
		System.out.println(checkDuplicateHashSet(new int[]{0}));
	}

	//very expensive solution O(n^2)
	public static boolean checkDuplicateExpensive(int[] arr){
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i] == arr[j]){
					return true;
				}
			}
		}
		return false;
	}
	//O(n) implementation
	public static boolean checkDuplicateHashSet(int[] arr){
		HashSet<Integer> myset = new HashSet<>();
		for(int i: arr){
			if(myset.contains(i)){
				return true;
			}else{
				myset.add(i);
			}
		}

		return false;
	}
}
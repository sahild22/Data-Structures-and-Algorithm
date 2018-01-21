/**
 *Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? \
 *Find all unique triplets in the array which gives the sum of zero.
 *Note: The solution set must not contain duplicate triplets.
 *For example, given array S = [-1, 0, 1, 2, -1, -4],
 *A solution set is:
 *[
  *[-1, 0, 1],
  *[-1, -1, 2]
*]
**/
import java.util.*;

class Sum3{
	public static void main(String[] args) {
		test(new int[]{-1, 0, 1, 2, -1, -4});
	}

	public static void test(int[] arr){
		System.out.println("Input array: " + printArray(arr));
		System.out.println("Result: ");
		printListOfList(findList(arr));
	}

	public static List findList(int[] arr){
		List<List<Integer>> result = new LinkedList<>();
		int a = 0;
		int b = 1;		
		for(int c = 2; c < arr.length; c++){
			if(arr[a] != arr[b] && arr[b] != arr[c] && arr[a] != arr[c]){
				if(arr[a] + arr[b] + arr[c] == 0){
					List<Integer> l = new LinkedList<>();
					l.add(arr[a]);
					l.add(arr[b]);
					l.add(arr[c]);
					result.add(l);
				}
			}
		}
		return result;
	}

	public static void printArray(int[] arr){
		System.out.print("{" + arr[0]);
		for(int i = 1; i < arr.length; i++){
			System.out.print(", " + arr[i]);
		}
		System.out.println("}");
	}

	public static void printListOfList(LinkedList l){
		int count = 0;
		for(LinkedList list : l){
			System.out.println("[");
			for(int i : list){
				if(count == 0){
					System.out.print("[ " + i);
					count++;
				}else{
					System.out.print(", " + i);
				}
			}
			System.out.println("],");
			count = 0;
		}
	}
}
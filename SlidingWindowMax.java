/*
Leet Code problem:
Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position. Return the max sliding window.

Example:

Input: nums = [1,3,-1,-3,5,3,6,7], and k = 3
Output: [3,3,5,5,6,7]
Explanation:

Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7

*/

public class SlidingWindowMax {

    public static void main(String[] args) {
        printArray((maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3)));
        printArray((maxSlidingWindow(new int[]{-7,-8,7,5,7,1,6,0}, 4)));
        printArray((maxSlidingWindow(new int[]{}, 0)));

    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0) return new int[0];
        int[] result = new int[nums.length - k + 1];
        for(int i = k - 1; i < nums.length; i++){
            int max = Integer.MIN_VALUE;
            for(int j = i - (k - 1) ; j <= i ; j++){
                max = Math.max(nums[j], max);
            }
            result[i - (k - 1)] = max;
        }
        return result;
    }

    public static void printArray(int[] arr){
        if(arr == null || arr.length == 0) return;
        System.out.println();
        System.out.print("[" + arr[0]);
        for(int i = 1; i < arr.length; i++){
            System.out.print(", " + arr[i]);
        }
        System.out.print("]");
        System.out.println();
    }

}

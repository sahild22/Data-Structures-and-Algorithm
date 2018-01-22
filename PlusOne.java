import java.util.*;

/**
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * The digits are stored such that the most significant digit is at the head of the list.
**/

class PlusOne {
    
    public static void main(String[] args) {
        test(new int[]{9,9,9,9,9}); 
        test(new int[]{0});   
    }

    public static void test(int[] arr){
        System.out.print("Input array: ");
        printArray(arr);
        System.out.print("Result array after adding 1: ");
        printArray(plusOne(arr));
    }

    public static int[] plusOne(int[] digits) {
        boolean carry = false;
        int x = 0;
        for(int i = digits.length - 1; i >= 0; i--){
            if(x == 0 || carry){
                x++;
                if(carry){
                    carry = false;
                }
                digits[i] = digits[i] + 1;
                if(digits[i] == 10){
                    carry = true;
                    digits[i] = 0;
                }
            }
        }
        if(carry){
            int[] newArr = new int[digits.length + 1];
            newArr[0] = 1;
            System.arraycopy(digits,0,newArr,1,digits.length);
            return newArr;
        }
    return digits;
    }

    public static void printArray(int[] arr){
        System.out.print("{" + arr[0]);
        for(int i = 1; i < arr.length; i++){
            System.out.print(", " + arr[i]);
        }
        System.out.println("}");
    }
}
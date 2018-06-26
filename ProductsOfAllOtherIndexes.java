/*
* Given an array return an array where each index has the products of all the OTHER numbers in the Array. Do this without the divide operator.
    Example:
    Given:
    arr = [1,2,3,4,5]

    Return:
    [120,60,40,30,24]

    The given array is not necessarily in sorted order.
* */

public class ProductsOfAllOtherIndexes {
    public static void main(String[] args) {
        printArray(findProduct(new int[]{1, 2, 3, 4, 5}));
        printArray(findProductLinear(new int[]{1, 2, 3, 4, 5}));
        printArray(findProductLinearBetter(new int[]{1, 2, 3, 4, 5}));

    }

    private static int[] findProduct(int[] arr){
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            int product = 1;
            for(int j = 0; j < arr.length; j++){
                if(j == i) continue;
                product *= arr[j];
            }
            result[i] = product;
        }
        return result;
    }

    private static int[] findProductLinear(int[] arr){
        int[] temp1 = new int[arr.length];
        int[] temp2 = new int[arr.length];
        int[] result = new int[arr.length];
        int product = 1;

        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                temp1[i] = product;
                continue;
            }
            product *= arr[i-1];
            temp1[i] = product;
        }
        product = 1;
        int index = 0;
        for(int j = arr.length - 1; j >= 0; j--){
            if(j == arr.length - 1){
                temp2[index] = product;
                index++;
                continue;
            }
            product *= arr[j + 1];
            temp2[index] = product;
            index++;
        }

        for(int i = 0, j = arr.length - 1; i < arr.length; i++, j--){
            result[i] = temp1[i] * temp2[j];
        }

        return result;
    }

    private static int[] findProductLinearBetter(int[] arr){
        int[] result = new int[arr.length];
        int product = 1;

        for(int i = 0; i < arr.length; i++) {
            result[i] = product;
            product *= arr[i];
        }

        product = 1;
        for(int j = arr.length - 1; j >= 0; j--) {
            result[j] = result[j] * product;
            product = product * arr[j];
        }
        return result;
    }

    private static void printArray(int[] arr){
        System.out.print("[" + arr[0]);
        for (int i = 1; i < arr.length; i++){
            System.out.print(", " + arr[i]);
        }
        System.out.println("]");
    }
}

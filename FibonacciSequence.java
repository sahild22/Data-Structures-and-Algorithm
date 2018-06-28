public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println(fibRecursive(10));
        System.out.println(fibMemoization(10, new int[11]));
        System.out.println(fibDynamic(10));
    }

    private static int fibRecursive(int n){
        int result = 0;
        if (n == 1 || n == 2){
            result = 1;
        }else{
            result = fibRecursive(n-1) + fibRecursive(n-2);
        }
        return result;
    }

    private static int fibMemoization(int n, int[] mem){
        if(mem[n] != 0){
            return mem[n];
        }
        int result = 0;
        if (n == 1 || n == 2){
            result = 1;
        }else{
            result = fibRecursive(n-1) + fibRecursive(n-2);
        }
        mem[n] = result;
        return result;
    }

    private static int fibDynamic(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i < n + 1; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n-1];
    }
}

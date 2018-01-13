class ReverseInteger{
	
	public static int reverse(int x){
		int result = 0;
		while(x != 0){
			int tail = x % 10;
			System.out.println("tail = " + tail);
			result = result * 10 + tail;
			if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
				return 0;
			}
			System.out.println("result = " + result);
			x = x/10;
			System.out.println("x is " + x);
		}
		return result;
	}

	public static void main(String[] args) {
	 System.out.println(reverse(1534236));	
	}
}	
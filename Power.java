class Power{
	/*
	Created by Sahil Diwan on 6th March 2017
	To compute power of a number using Recursion
	*/
	public static void main(String[] args){
		int result;
		result = Power(2, 10);
		System.out.println("Result is: " + result);
	}

	public static int Power(int X, int n){
		if(n == 1){
			return X;
		}
		int T = Power(X, (int)Math.floor(n/2));
		T = T * T;
		if(n % 2 == 1){
			T = T * X;
		}
		return T;
	}

}
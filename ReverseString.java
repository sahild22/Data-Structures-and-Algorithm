/**
 *Write a function that takes a string as input and returns the string reversed.
 *Example:
 *Given s = "hello", return "olleh".
**/

class ReverseString{
	public static void main(String[] args) {
		test("hello");
		test("");
	}

	public static void test(String input){
		System.out.println("Original String = " + input);
		System.out.println("Reversed String = " + reverse(input));
	}

	public static String reverse(String input){
		char[] inputArray = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = inputArray.length - 1; i >= 0; i--){
			sb.append(inputArray[i]);
		}
		return sb.toString();
	}
}
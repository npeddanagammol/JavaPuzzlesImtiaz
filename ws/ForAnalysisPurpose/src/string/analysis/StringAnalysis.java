package string.analysis;


public class StringAnalysis {

	// Conversion

	static int i = 10;
	static boolean bool = true;
	static String str = String.valueOf(i);
	static String strBoolean = String.valueOf(bool);

	public static void main(String[] args) {
		System.out.println(str);
		System.out.println(strBoolean);

		// Finding divisible numbers
		int arr[] = new int[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		System.out.println(arr[i]);
		System.out.println("Numbers divisible by 2 are :");

		for (int numbers : arr) {
			if (numbers % 2 == 0) {
				System.out.println(numbers);
			}
		}

		System.out.println("Numbers divisible by 7 are :");

		for (int numbers : arr) {
			if (numbers % 7 == 0) {
				System.out.println(numbers);
			}
		}
	}
}

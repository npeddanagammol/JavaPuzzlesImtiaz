package booleanAnalysis;

public class BooleanAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] params1 = { 70, 95, 95, 90, 90, 50, 50, 100, 100, 105, 59, 59, 60 };

		boolean[] params2 = { false, false, true, false, true, false, true, false, true, true, false, true, false };

		test(params1, params2);
	}

	public static void test(int[] param1, boolean[] param2) {

		for (boolean b : param2) {

			if (b) {
				System.out.println("true");
			} else
				System.out.println("!!!!!!!");
		}
	}
}

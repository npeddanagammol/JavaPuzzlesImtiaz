package assignment_12;

import ignore.TestingUtils;

public class App {

	/**
	 * 
	 * Return a version of the given string, where for every star (*) in the string
	 * the star and the chars immediately to its left and right are gone. So "ab*cd"
	 * yields "ad" and "ab**cd" also yields "ad". <br>
	 * <br>
	 * 
	 * <b>EXPECTATIONS:</b><br>
	 * starKill("cd*zq") <b>---></b>"cq"<br>
	 * starKill("ab**cd") <b>---></b> "ad" <br>
	 * starKill("wacy*xko") <b>---></b> "wacko" <br>
	 */

	public static String starKill(String str) {

		String result = "";
		int len = str.length();
		for (int i = 0; i < len; i++) {
			
			if (i == 0 && str.charAt(i) != '*') 
				result += str.charAt(i);
			
			if (i > 0 && str.charAt(i) != '*' && str.charAt(i - 1) != '*') 
				result += str.charAt(i);
			
			if (i > 0 && str.charAt(i) == '*' && str.charAt(i - 1) != '*') 
				result = result.substring(0, result.length() - 1);
			
			
		}return result;

	}
	
	/*
	 * Explainantion
	 * i = 0 = a;
result = a(1st loop) 
result=a(2nd loop)

i = 1 = b;
result = “ab”(1st loop)
result=“ab”(2nd loop)

i = 2 = *;
result = a(3rd loop)


i = 3 = c;
result = ac(1st loop)
result = a(2nd loop)

i = 4 = d
result=ad(1st loop)
result=ad(2nd loop)
	 */

		
	

	// ----------------------STARTING POINT OF PROGRAM. IGNORE BELOW
	// --------------------//
	public static void main(String args[]) {
		TestingUtils.runTests();

	}
}

package practice.recursion;

public class addtionalCharacters {

	public static void main(String[] args) {
		System.out.println(allDollors("hello"));
		System.out.println(allDollors("bangalore"));
		
		
	}
	public static String allDollors(String str) {
		
		if(str.length() <= 1) {
		return str; 
	}
		return str.charAt(0)+"$"+allDollors(str.substring(1));
	}
}

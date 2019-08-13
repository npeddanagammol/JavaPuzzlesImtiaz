package practice.recursion;

public class ReverseOrderPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		printNum(4);
	}

//	public static void printNum(int num) {
//		
//		if(num == 0) {
//			
//		}
//		else {
//			System.out.println(num);
//			num = num - 1;
//			printNum(num);
//			
//		}
//	}
	
	
	public static int printNum(int num) {
		if(num == 0) {
			return 0; 
		}
		System.out.println(num);
		return printNum(num - 1);
		
	}
	
	
	
	
}

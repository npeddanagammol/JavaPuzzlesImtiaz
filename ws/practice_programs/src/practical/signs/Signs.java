package practical.signs;

public class Signs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		operators(10);

	}
	
	public static void operators(int num1) {
		
		int n = 10;
		int result = 0;
		
		if(num1 >= 10) {
			result = 1;
			
		}
		if(num1 <= 10) {
			result = 2;
			
		}
		System.out.println(result);
	}

}

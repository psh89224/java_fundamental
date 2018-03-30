
public class MethodTest07 {
	
	static int x = 700;		// 전역 변수(global variable)
	static int y = 900;
	
	public static void printX() {
		System.out.println("3번 x = " + x);
	}
	
	public static void main (String[] args) {
		System.out.println("1번 x = " + x);
		
		int x = 800;		// 지역 변수(local variable)
		
		System.out.println("2번 x = " + x);
		
		printX();
		
		System.out.println("4번 x = " + MethodTest07.x);
		System.out.println("y = " + y);		// MethodTest07.y
	}

}

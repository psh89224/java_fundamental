
public class ExceptionText02 {
	public static void main(String[] args) {
		try {
			System.out.println(10/5);
			System.out.println(10/2);
			System.out.println(10/3);
			System.out.println(10/0);
			System.out.println(10/4);
			System.out.println(10/3);
		} catch (ArithmeticException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("다른예외처리");
		}
		System.out.println(10);
	}

}

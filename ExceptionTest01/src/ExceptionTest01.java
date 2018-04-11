
public class ExceptionTest01 {
	public static void main(String[] args) {
		int[] a = new int[] {10, 20, 30, 40, 50};
		
		
		try {
			for(int i=0; i<7; i++) {
				System.out.println(a[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스에서 예외가 발생했습니다.");
		}
		System.out.println("예외처리");
	}
}
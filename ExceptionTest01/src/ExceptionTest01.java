
public class ExceptionTest01 {
	public static void main(String[] args) {
		int[] a = new int[] {10, 20, 30, 40, 50};
		
		
		try {
			for(int i=0; i<7; i++) {
				System.out.println(a[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε������� ���ܰ� �߻��߽��ϴ�.");
		}
		System.out.println("����ó��");
	}
}

public class EnhancedForTest {
	public static void main(String[] args) {
		int[] a = new int[] {10, 20, 30, 40, 50};
		
		// �⺻ for��
		for(int i =0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		// ���� for��(enhanced-for��)
		for(int i : a) {		// int : �� �����Ÿ��, i : �� ����� ��
								// : ~�ȿ� �ִ�(in), a : int[] �迭
			System.out.println(i);
		}
	}

}

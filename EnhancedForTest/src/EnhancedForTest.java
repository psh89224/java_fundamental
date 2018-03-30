
public class EnhancedForTest {
	public static void main(String[] args) {
		int[] a = new int[] {10, 20, 30, 40, 50};
		
		// 기본 for문
		for(int i =0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		// 향상된 for문(enhanced-for문)
		for(int i : a) {		// int : 각 요소의타입, i : 각 요소의 값
								// : ~안에 있는(in), a : int[] 배열
			System.out.println(i);
		}
	}

}

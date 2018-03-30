		import java.util.Arrays;
import java.util.Scanner;

public class MethodTest09 {
	
	
	// 1번 검색 메소드 - 1개를 찾으면 바로 리턴...(2개 이상 중복된값 검색 불가)
	public static int linearSearch(int[] x, int k) {
		for(int i=1; i<x.length; i++) {
			if(k == x[i]) {
				return i;
			}
		}
		return -1;
	}
	
	// 2번 검색 메소드 - 2개 이상을 찾을경우에도 가능.
	public static int linearSearch2(int[] x, int k) {
		int count = 0;
		for(int i=0; i<x.length; i++) {
			if(x[i] == k) {
				System.out.print((i+1) + "번째 ");
				++count;
			}
		}
		return count;
	}
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--- 선형 검색 프로그램 ---");
		System.out.print("배열의 갯수 입력 : ");
		int n = sc.nextInt();
		System.out.print("검색할 값 입력 : ");
		int key = sc.nextInt();
		
		int [] a = new int[n];
		
		for(int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random() * 10) + 1;	// 0부터 10까의 난수
		}
		System.out.println(Arrays.toString(a));
		
		// 1번 메소드 호출 방법
		/*int findIdx = linearSearch(a, key);
		if(findIdx == -1) {
			System.out.println("검색하신 값은 존재하지 않습니다.");
		} else {
			System.out.println("검색한 값은 " + (findIdx+1) + " 번째 입니다.");
		}*/
		
		// 2번 메소드 호출 방법
		int count = linearSearch2(a, key);
		if(count == 0) {
			System.out.println("검색한 값이 존재하지 않습니다");
		} else {
			System.out.println("에 있습니다.\n검색한 값은 " +(count)+"개 있습니다.");
		}
		
		sc.close();		
	}
}
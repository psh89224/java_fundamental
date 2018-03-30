import java.util.Scanner;

public class Loop02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int n = sc.nextInt();
		
		// 1번 for *표 점차 늘리기 
		/*for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		// 2번 for *표 점차 줄이기
		/*for (int i=1; i<=n; i++) {
			for (int j=n; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		// 2-2번 for *표 점차 줄이기
		/*for (int i=1; i<=n; i++) {
			for (int j=1; j<=n+1-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		// 2-3번 
		for (int i=1; i<=n; i++) {
			for (int j=i; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// while
		/*int i=1, j=1;
		while (i<=n) {
			
		}*/
		
		sc.close();
	}

}

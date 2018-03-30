import java.util.Scanner;

public class Loop03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int n = sc.nextInt();
		
		// 3번 여백 1칸씩 늘리며 *찍기
		/*for(int i=1; i<=n; i++) {
			for (int j=1; j<=i-1; j++) {
				System.out.print("  ");
			}
			for (int j=1; j<=n+1-i; j++) {
				System.out.print("* ");
			}
			System.out.println();*/
			
		// 4번 여백 1칸씩 줄이며 * 찍기
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n+1-i; j++) {
				System.out.print("  ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}

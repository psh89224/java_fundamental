import java.util.Scanner;

public class Loop01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**정사각형 만들기**");
		
		
		System.out.print("정수입력 : ");
		int n = sc.nextInt();
		
		// for 문 활용
		/*for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("*");
			} 
			System.out.println();
		} */
		
		// while 문 활용
		/*int i=1, j=1;
		while(i<=n) {
			j=1;
			while(j<=n) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}*/
		
		// do-while 문 활용
		int i=1, j=1;
		do {
			j=1;
			do {
				System.out.print("*");
				j++;
			} while(j<=n);
			System.out.println();
			i++;
		} while(i<=n);
		
		sc. close();
	}

}

import java.util.Scanner;

public class Array2DTest05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행열 수 입력 : ");
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		int k =1;
			
			// 내부 2차원 배열 값 생성 부분
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					a[i][j] = k++;
				}
			}
			
			// 2차원 배열을 출력 부분
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					System.out.printf("%5d",a[i][j]);
				} System.out.println();
			} sc.close();
	}

}

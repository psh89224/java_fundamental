import java.util.Scanner;

public class Loop01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**���簢�� �����**");
		
		
		System.out.print("�����Է� : ");
		int n = sc.nextInt();
		
		// for �� Ȱ��
		/*for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("*");
			} 
			System.out.println();
		} */
		
		// while �� Ȱ��
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
		
		// do-while �� Ȱ��
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

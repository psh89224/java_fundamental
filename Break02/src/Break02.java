import java.util.Scanner;

public class Break02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int  i, sum=0;
		
		while(true) {
			System.out.print("�����Է�(0�� �Է��ϸ� ����) : ");
			i=sc.nextInt();
			
				if (i==0) {
					break;
				}
				sum += i;
		}
		System.out.print("�� ���� : " + sum);
		sc.close();
	}

}

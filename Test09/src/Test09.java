import java.util.Scanner;

public class Test09 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);	// Scanner �ֿܼ� �Է�(in)�ϱ����� Ŭ����
		     // sc ��������		      // ���Է�(in)��Ʈ��			
		System.out.print("���� �Է� : ");
	        // �����(out)��Ʈ��
		int num = sc.nextInt();	
		
		if (num > 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�.");
		} else if (num < 0) {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
		} else {		// else if (num == 0)
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		}
		
		sc.close();
	}

}

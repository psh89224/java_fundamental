import java.util.Scanner;

public class Game01 {
	public static void main (String[] args ) {
		Scanner sc = new Scanner(System.in);
		String[] s = {"����", "����", "��"};
		int[] score = new int[3];	// ���� ī��Ʈ ����
		String retry;				// ������ �ǻ繯��
		
		System.out.print("���������� ����");
		
		do {
			System.out.print("���� �Է�(0-����//1-����//2-��) : ");
			int user = sc.nextInt();
			int com = (int)(Math.random() * 3);
			
			System.out.println("����� "+s[user]+"�� �°�, ��ǻ�ʹ� "+s[com]+"�� �½��ϴ�.");
			
			int result = (user - com + 3) % 3;
			switch(result) {
			case 1:
				System.out.println("����� �¸� �Ͽ����ϴ�.");
				++score[1];
				break;
			case 2:
				System.out.println("����� �й� �Ͽ����ϴ�.");
				++score[2];
				break;
			case 0:
				System.out.println("�����ϴ�.");
				++score[0];
			}
			System.out.print("�ѹ� �� �Ͻðڽ��ϱ�?(y/n) : ");
			retry = sc.next();
			
		}while(retry.equalsIgnoreCase("y"));
		System.out.println(score[1]+"��"+score[0]+"��"+score[2]+"��");
		
		sc.close();
	}
}
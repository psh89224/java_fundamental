import java.util.Scanner;
public class Test13 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Է� 1 : ");
		int a = sc.nextInt();
		System.out.print("�����Է� 2 : ");
		int b = sc.nextInt();
		System.out.print("�����Է� 3 : ");
		int c = sc.nextInt();
		
		int max = a , min = a;
		
		// �ִ밪 ���ϱ�  if���� �ѹ�����, ���ѹ� ����, else�� �ѹ����� �ѱ�⶧���� ������ X
		if (b > max) {
			max = b;
		} 
		if (c > max) {
			max = c;
		}
		
		// �ּҰ� ���ϱ�
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		
		sc.close();
	}

}

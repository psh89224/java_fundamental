package test;
import shape.*;

public class ShapeTest01 {
	public static void main(String[] args) {
		// 1�� �迭 ����� (���� �� �ʱ�ȭ)
		/*Shape[] s = new Shape[3];
		
		s[0] = new Rectangle();
		s[1] = new Triangle();
		s[2] = new Circle();*/
		
		// 2�� �迭 ����� (������ ���ÿ� �ʱ�ȭ)
		Shape[] s = new Shape[] {
				new Rectangle(),
				new Triangle(),
				new Circle()
		};
		
		// 1�� �⺻ for��
		for(int i=0; i<s.length; i++) {
			s[i].draw();
		}
		System.out.println("================");
		
		// 2�� Ȯ�� for��
		for(Shape p : s) {
			p.draw();
		}
	}
}

class MyMath2 {
	long a, b;
	
	// �ν��ϼ����� - a, b�� �̿��ؼ� �۾��ϹǷ� �Ű������� ����.
	long add() {
		return a + b;
	}
	long subtract() {
		return a - b;
	}
	long multiply() {
		return a * b;
	}
	double divide() {
		return a / b;
	}
	
	// Ŭ�������� - �ν��Ͻ������� ������� �Ű����������� �۾������ϴ�.
	static long add(long a, long b) {
		return a + b;
	}
	static long subtract(long a, long b) {
		return a - b;
	}
	static long multiply(long a, long b) {
		return a * b;
	}
	static double divide(double a, double b) {
		return a / b;
	}
}
public class MyMathTest2 {
	public static void main(String[] args) {
		// Ŭ�����޼��� ȣ��, �ν��Ͻ� �������� ȣ�Ⱑ��
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200.0, 100.0));
		
		MyMath2 mm = new MyMath2();		// �ν��Ͻ� ����
		mm.a = 200L;
		mm.b = 100L;
		
		// �ν��Ͻ� �޼���� ��ü���� �Ŀ��� ȣ���� �����ϴ�..
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}

}
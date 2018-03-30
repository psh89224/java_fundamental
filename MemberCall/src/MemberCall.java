
public class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv				// Ŭ���������� �ν��Ͻ������� ����� �� ����				
	static int cv2 = new MemberCall().iv;		// ��ó�� ��ü�� �����ؾ� ��밡��(�͸� �ν��Ͻ�)
												// 1ȸ��, �ѹ��� ��밡��	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv);		// Ŭ�����޼ҵ忡�� �ν��ϼ����� ���Ұ�
		MemberCall c = new MemberCall();
		System.out.println(c.iv);	// ��ü �����Ŀ��� �ν��ϼ����� ��밡��
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);		// �ν��Ͻ��޼ҵ忡���� �ν��Ͻ����� �ٷ� ��밡��
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1();			// Ŭ�����޼ҵ忡���� �ν��Ͻ��޼ҵ� ȣ��Ұ�
		MemberCall c = new MemberCall();
		c.instanceMethod1();
	}
	
	void instanceMethod2() {		// �ν��Ͻ��޼ҵ忡���� �ν��Ͻ��޼ҵ�� Ŭ�����޼ҵ�
		staticMethod1();			// ��� �ν��Ͻ� �������� ȣ�Ⱑ���ϴ�
		instanceMethod1();
	}

}

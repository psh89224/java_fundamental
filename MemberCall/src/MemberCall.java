
public class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv				// 클래스변수는 인스턴스변수를 사용할 수 없음				
	static int cv2 = new MemberCall().iv;		// 이처럼 객체를 생성해야 사용가능(익명 인스턴스)
												// 1회용, 한번만 사용가능	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv);		// 클래스메소드에서 인스턴수변수 사용불가
		MemberCall c = new MemberCall();
		System.out.println(c.iv);	// 객체 생성후에야 인스턴수변수 사용가능
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);		// 인스턴스메소드에서는 인스턴스변수 바로 사용가능
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1();			// 클래스메소드에서는 인스턴스메소드 호출불가
		MemberCall c = new MemberCall();
		c.instanceMethod1();
	}
	
	void instanceMethod2() {		// 인스턴스메소드에서는 인스턴스메소드와 클래스메소드
		staticMethod1();			// 모두 인스턴스 생성없이 호출가능하다
		instanceMethod1();
	}

}

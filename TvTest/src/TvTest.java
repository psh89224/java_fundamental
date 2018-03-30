class Tv {
	
	// 멤버 변수
	String color;
	boolean power;
	int channel;
	
	// 멤버 메소드
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

public class TvTest {
	
	public static void main(String[] args) {
		// tv1의 인스턴스
		Tv tv1 = new Tv();	
		tv1.color = "RED";
		tv1.power();	// tv1.power = true;
		tv1.channel = 9;
		tv1.channelUp();
		tv1.channelUp();
		
		System.out.println("tv1의 색상은 " +tv1.color+ " 입니다.");
		System.out.println("tv1의 전원은 " +(tv1.power==true ? "ON" : "OFF")+ " 상태입니다.");
		System.out.println("tv1의 현재 채널은 " +tv1.channel+ "번 입니다.");
		System.out.println();
		
		// tv2의 인스턴스
		Tv tv2 = new Tv();
		tv2.color = "BLACK";
		tv2.power();
		tv2.channel = 15;
		tv2.channelUp();
		
		System.out.println("tv2의 색상은 " +tv2.color+ " 입니다."); 
		System.out.println("tv2의 전원은 " +(tv2.power==true ? "ON" : "OFF")+ " 입니다.");
		System.out.println("tv2의 현재채널은 " +tv2.channel+ "번 입니다");
		System.out.println();
		
		// 참조변수의 변경
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		t2 = t1;	// t1이 참조하는 인스턴스의 값을 t2도 참조한다.
		t1.channel = 7;
		
		System.out.println("t1의 채널은 " +t1.channel+ "입니다.");
		System.out.println("t2의 채널은 " +t2.channel+ "입니다.");
		
		
		
	}

}

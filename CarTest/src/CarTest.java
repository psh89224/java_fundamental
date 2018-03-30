class Car {				// 인스턴스 변수
	int serialNo;
	String color;	
	String gearType;
	int door;
	
	static int count = 0;
	// 인스턴스 초기자
	{
		serialNo = ++count;
	}
	
	// 기본생성자
	Car() {	
		//this("black", "auto", 3);	// this는 무조건 첫번째 줄
		this.color = "black";
		this.gearType = "auto";
		this.door = 3;
		//serialNo = ++count;
	}
	Car(String color) {
		//this(color, "auto", 4);
		this.color = color;
		this.gearType = "auto";
		this.door = 5;
		//serialNo = ++count;
	}
	
	// 매개변수 생성자
	Car(String color, String gearType, int door) {	
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		//serialNo = ++count;
	}
	
	// 복사 생성자
	Car(Car c) {
		//this(c.color, c.gearType, c.door);
		color = c.color;
		gearType = c.gearType;
		door = c.door;
		//serialNo = ++count;
	}
}
public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();						// 기본생성자 이용
		/*c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;*/
		
		Car c2 = new Car("black", "manual", 5);	// 매개변수생성자 이용
		Car c3 = new Car("blue");
		Car c4 = new Car(c3);					// 복사생성자 이용
		
		System.out.println("c1의 serialNo="+c1.serialNo+", 색상="+c1.color+", 기어타입="+c1.gearType+", 문갯수="+c1.door);
		System.out.println("c2의 serialNo="+c2.serialNo+", 색상="+c2.color+", 기어타입="+c2.gearType+", 문갯수="+c2.door);
		System.out.println("c3의 serialNo="+c3.serialNo+", 색상="+c3.color+", 기어타입="+c3.gearType+", 문갯수="+c3.door);
		System.out.println("c4의 serialNo="+c4.serialNo+", 색상="+c4.color+", 기어타입="+c4.gearType+", 문갯수="+c4.door);
		
	}

}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brr~~");
	}
	
	void shop() {
		System.out.println("stop!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!");
	}
}

public class CastingTest01 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine ();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		if (car instanceof FireEngine) {
			((FireEngine)car).water();
		}
		fe2 = (FireEngine)car;
		fe2.water();
	}
}
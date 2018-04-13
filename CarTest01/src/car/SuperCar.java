package car;

public class SuperCar implements Car {
	private String name;
	
	public SuperCar(String name) {
		this.name = name;
	}
	
	private int id;
	private static int count = 0;
	
	public SuperCar() {
		id = ++count;
	}
	
	@Override
	public void run() {
		System.out.println(name+"SuperCar 출발합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println(name+"SuperCar 멈춥니다.");
	}
	
	public void printInfo() {
		System.out.println("제조번호는 [" + id + "] 입니다.");
	}

}
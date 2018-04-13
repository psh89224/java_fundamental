package car;

public class SUV implements Car {
	private String name;
	
	public SUV(String name) {
		this.name = name;
	}
	
	private int id;
	private static int count = 0;
	
	public SUV() {
		id = ++count;
	}
	
	@Override
	public void run() {
		System.out.println(name+"SUV 출발합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println(name+"SUV 멈춥니다.");
	}
	
	public void printInfo() {
		System.out.println("제조번호는 [" + id + "] 입니다.");
	}
}
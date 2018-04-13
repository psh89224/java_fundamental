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
		System.out.println(name+"SuperCar ����մϴ�.");
	}
	
	@Override
	public void stop() {
		System.out.println(name+"SuperCar ����ϴ�.");
	}
	
	public void printInfo() {
		System.out.println("������ȣ�� [" + id + "] �Դϴ�.");
	}

}
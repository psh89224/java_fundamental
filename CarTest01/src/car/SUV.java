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
		System.out.println(name+"SUV ����մϴ�.");
	}
	
	@Override
	public void stop() {
		System.out.println(name+"SUV ����ϴ�.");
	}
	
	public void printInfo() {
		System.out.println("������ȣ�� [" + id + "] �Դϴ�.");
	}
}
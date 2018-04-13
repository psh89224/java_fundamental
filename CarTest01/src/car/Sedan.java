package car;

public class Sedan implements Car {
	private String name;
	
	public Sedan(String name) {
		this.name = name;
	}
	
	private int id;
	private static int count = 0;
	
	public Sedan() {
		id = ++count;
	}
	
	@Override
	public void run() {
		System.out.println(name+"Sedan ����մϴ�.");
	}
	
	@Override
	public void stop() {
		System.out.println(name+"Sedan ����ϴ�.");
	}
	
	public void printInfo() {
		System.out.println("������ȣ�� [" + id + "] �Դϴ�.");
	}

}
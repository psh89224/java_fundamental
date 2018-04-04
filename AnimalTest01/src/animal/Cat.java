package animal;

public class Cat extends Animal {
	public int age;
	
	public Cat(String name, int age) {
		super(name);
		this.age = age;
	}
	
	@Override
	public void bark() {
		System.out.println("�߿�..�־�");
	}
	
	public String toString() {
		return "**���̰� " +age+ "�� " +getName();
	}

}

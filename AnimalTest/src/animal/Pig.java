package animal;

public class Pig extends Animal {
	public Pig(String name, int age) {
		super(name, age);		
	}

	@Override
	public void bark() {
		System.out.println("�ܲܲܡ�");
	}

	@Override
	public void move() {
		System.out.println("�Դ´١�");
	}

	@Override
	public String toString() {
		return "�̸��� "+getName()+"�̰�, ���̴� "+getAge();
	}

}

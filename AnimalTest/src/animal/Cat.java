package animal;

public class Cat extends Animal {
	public Cat(String name, int age) {
		super(name, age);		
	}

	@Override
	public void bark() {
		System.out.println("�߿ˡ�");
	}

	@Override
	public void move() {
		System.out.println("����̼�����");
	}

	@Override
	public String toString() {
		return "�̸��� "+getName()+"�̰�, ���̴� "+getAge();
	}

}

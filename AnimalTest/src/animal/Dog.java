package animal;

public class Dog extends Animal {
	
	public Dog(String name, int age) {
		super(name, age);		
	}

	@Override
	public void bark() {
		System.out.println("�۸۸ۡ�");
	}

	@Override
	public void move() {
		System.out.println("�յ���");
	}

	@Override
	public String toString() {
		return "�̸��� "+getName()+"�̰�, ���̴� "+getAge();
	}

}

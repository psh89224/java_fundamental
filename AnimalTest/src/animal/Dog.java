package animal;

public class Dog extends Animal {
	
	public Dog(String name, int age) {
		super(name, age);		
	}

	@Override
	public void bark() {
		System.out.println("멍멍멍☆");
	}

	@Override
	public void move() {
		System.out.println("손들어☆");
	}

	@Override
	public String toString() {
		return "이름이 "+getName()+"이고, 나이는 "+getAge();
	}

}

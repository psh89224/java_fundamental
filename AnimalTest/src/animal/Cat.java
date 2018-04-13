package animal;

public class Cat extends Animal {
	public Cat(String name, int age) {
		super(name, age);		
	}

	@Override
	public void bark() {
		System.out.println("야옹★");
	}

	@Override
	public void move() {
		System.out.println("고양이세수★");
	}

	@Override
	public String toString() {
		return "이름이 "+getName()+"이고, 나이는 "+getAge();
	}

}

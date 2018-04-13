package animal;

public class Pig extends Animal {
	public Pig(String name, int age) {
		super(name, age);		
	}

	@Override
	public void bark() {
		System.out.println("²Ü²Ü²Ü¡İ");
	}

	@Override
	public void move() {
		System.out.println("¸Ô´Â´Ù¡İ");
	}

	@Override
	public String toString() {
		return "ÀÌ¸§ÀÌ "+getName()+"ÀÌ°í, ³ªÀÌ´Â "+getAge();
	}

}

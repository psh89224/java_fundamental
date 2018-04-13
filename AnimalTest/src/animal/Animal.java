package animal;

public abstract class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public abstract void bark();
	public abstract void move();
	public abstract String toString();
	
	public void introduce() {
		System.out.println(toString()+"¿‘¥œ¥Ÿ.");
		bark();
		move();
		System.out.println();
	}
}

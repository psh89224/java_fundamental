package animal;

public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void bark();
	public abstract String toString();
	
	public void introduce() {
		System.out.println(toString()+"¿‘¥œ¥Ÿ.");
		bark();
	}
}

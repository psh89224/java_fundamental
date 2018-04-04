package animal;

public class Dog extends Animal {
	public String type;
	
	public Dog(String name, String type) {
		super(name);
		this.type = type;
	}
	
	@Override
	public void bark() {
		System.out.println("�۸�");
	}
	public String toString() {
		return "*ǰ���� " +type+ "�� " +getName();
	}
}
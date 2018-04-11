import java.util.HashSet;

class Person {
	private String name;
	private int age;
	
	Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals (Object obj) {
		if(obj instanceof Person) {
			Person tmp = (Person)obj;
			return name.equals(tmp.name) && age==tmp.age;
		} return false;
	}
	
	@Override
	public int hashCode() {
		return (name+age).hashCode();
	}
	
	@Override
	public String toString() {
		return name+":"+age;
	}
}
public class HashSetEx03 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		
		System.out.println(set);		
	}
}
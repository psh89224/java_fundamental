package test;
import animal.*;

public class AnimalTest {
	public static void main(String[] args) {
		Animal[] animals = new Animal [] {
				new Dog("��������", 1),
				new Cat("����̡�", 2),
				new Pig("������", 3),
				
		};
		for(Animal a : animals) {
			a.introduce();
		}
		
	}

}

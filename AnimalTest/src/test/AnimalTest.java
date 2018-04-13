package test;
import animal.*;

public class AnimalTest {
	public static void main(String[] args) {
		Animal[] animals = new Animal [] {
				new Dog("강아지☆", 1),
				new Cat("고양이★", 2),
				new Pig("돼지◎", 3),
				
		};
		for(Animal a : animals) {
			a.introduce();
		}
		
	}

}

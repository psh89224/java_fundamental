package test;
import animal.*;

public class AnimalTest01 {
	public static void main(String[] args) {
		Animal[] animals = new Animal [] {
				new Dog("산체", "장모치와와"),
				new Cat("마루", 3),
				new Dog("뿡이", "말티즈"),
				new Cat("쿵이", 4)
		};
		for(Animal a : animals) {
			a.introduce();
		}
	}

}

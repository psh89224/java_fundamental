package test;
import animal.*;

public class AnimalTest01 {
	public static void main(String[] args) {
		Animal[] animals = new Animal [] {
				new Dog("��ü", "���ġ�Ϳ�"),
				new Cat("����", 3),
				new Dog("����", "��Ƽ��"),
				new Cat("����", 4)
		};
		for(Animal a : animals) {
			a.introduce();
		}
	}

}

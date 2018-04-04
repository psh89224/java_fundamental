package test;
import pet.Pet;
import pet.RobotPet;

public class PetTest01 {
	public static void main(String[] args) {
		Pet[] p = {
			new Pet("¹úÀÌ", "ÀÌ¼­Áø"),
			new RobotPet("´ÙÀÌ¾Æ", "Â÷½Â¿ø"),
			new Pet("Àè½¼", "À±±Õ»ó")
		};
		
		for(Pet a : p) {
			a.introduce();
			if (a instanceof RobotPet) {
				((RobotPet) a).work(2);
			}
			System.out.println();
		}
	}

}

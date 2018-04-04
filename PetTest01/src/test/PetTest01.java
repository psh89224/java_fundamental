package test;
import pet.Pet;
import pet.RobotPet;

public class PetTest01 {
	public static void main(String[] args) {
		Pet[] p = {
			new Pet("����", "�̼���"),
			new RobotPet("���̾�", "���¿�"),
			new Pet("�轼", "���ջ�")
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

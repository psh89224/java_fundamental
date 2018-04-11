package test;
import wearable.*;

public class WearableTest01 {
	public static void main(String[] args) {
		Wearable[] w = {
				new WearableComputer("����"),
				new WearableRobot(1),
				new WearableComputer("������"),
				new WearableRobot(4),
		};
		// �⺻ for��
		/*for(int i=0; i<w.length; i++) {
			w[i].putOn();
			w[i].putOff();
			System.out.println();
		}*/
		
		// Ȯ�� for��
		for(Wearable wa : w) {
			wa.putOn();
			wa.putOff();
			System.out.println();
		}
	}

}

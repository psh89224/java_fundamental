package test;
import wearable.*;

public class WearableTest01 {
	public static void main(String[] args) {
		Wearable[] w = {
				new WearableComputer("수지"),
				new WearableRobot(1),
				new WearableComputer("아이유"),
				new WearableRobot(4),
		};
		// 기본 for문
		/*for(int i=0; i<w.length; i++) {
			w[i].putOn();
			w[i].putOff();
			System.out.println();
		}*/
		
		// 확장 for문
		for(Wearable wa : w) {
			wa.putOn();
			wa.putOff();
			System.out.println();
		}
	}

}

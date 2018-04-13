package test;
import car.*;

public class CarTest01 {
	public static void main(String[] args) {
		Car[] cars = {
				new Sedan("���׽ý�"),
				new SuperCar("�ΰ�Ƽ"),
				new SUV("����Ƽ��"),
		};
		for(Car c : cars) {
			c.run();
			if(c instanceof Sedan) {
				((Sedan)c).printInfo();
			}
			if(c instanceof SuperCar) {
				((SuperCar)c).printInfo();
			}
			if(c instanceof SUV) {
				((SUV)c).printInfo();
			}
			c.stop();
			System.out.println();
		}	
	}
}
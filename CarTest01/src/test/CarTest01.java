package test;
import car.*;

public class CarTest01 {
	public static void main(String[] args) {
		Car[] cars = {
				new Sedan("제네시스"),
				new SuperCar("부가티"),
				new SUV("스포티지"),
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
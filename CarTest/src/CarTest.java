class Car {				// �ν��Ͻ� ����
	int serialNo;
	String color;	
	String gearType;
	int door;
	
	static int count = 0;
	// �ν��Ͻ� �ʱ���
	{
		serialNo = ++count;
	}
	
	// �⺻������
	Car() {	
		//this("black", "auto", 3);	// this�� ������ ù��° ��
		this.color = "black";
		this.gearType = "auto";
		this.door = 3;
		//serialNo = ++count;
	}
	Car(String color) {
		//this(color, "auto", 4);
		this.color = color;
		this.gearType = "auto";
		this.door = 5;
		//serialNo = ++count;
	}
	
	// �Ű����� ������
	Car(String color, String gearType, int door) {	
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		//serialNo = ++count;
	}
	
	// ���� ������
	Car(Car c) {
		//this(c.color, c.gearType, c.door);
		color = c.color;
		gearType = c.gearType;
		door = c.door;
		//serialNo = ++count;
	}
}
public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();						// �⺻������ �̿�
		/*c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;*/
		
		Car c2 = new Car("black", "manual", 5);	// �Ű����������� �̿�
		Car c3 = new Car("blue");
		Car c4 = new Car(c3);					// ��������� �̿�
		
		System.out.println("c1�� serialNo="+c1.serialNo+", ����="+c1.color+", ���Ÿ��="+c1.gearType+", ������="+c1.door);
		System.out.println("c2�� serialNo="+c2.serialNo+", ����="+c2.color+", ���Ÿ��="+c2.gearType+", ������="+c2.door);
		System.out.println("c3�� serialNo="+c3.serialNo+", ����="+c3.color+", ���Ÿ��="+c3.gearType+", ������="+c3.door);
		System.out.println("c4�� serialNo="+c4.serialNo+", ����="+c4.color+", ���Ÿ��="+c4.gearType+", ������="+c4.door);
		
	}

}

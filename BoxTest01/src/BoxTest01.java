interface Comparable {
	int compareTo(Object other);
}

class Box implements Comparable {
	private double volume = 0;
	
	public Box(double volume) {
		this.volume = volume;
	}
	public int compareTo(Object otherObject) {
		Box other = (Box) otherObject;
		if (this.volume < other.volume) 
			return -1;
		else if (this.volume > other.volume)
			return 1;
		else 
			return 0;
	}
}

public class BoxTest01 {
	public static void main(String[] args) {
		Box b1 = new Box(100);
		Box b2 = new Box(85.0);
		if (b1.compareTo(b2) > 0)
			System.out.println("b1�� b2���� �� ũ��");
		else
			System.out.println("b1�� b2�� ���ų� �۴�");	
	}
}
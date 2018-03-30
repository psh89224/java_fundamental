class Data1 {
	int value;
	Data1(){
		System.out.println("Data1의 default생성자");
	}
}
class Data2 {
	int value;
	
	/*Data2() {
		System.out.println("Data2의 default생성자");
	}*/
	Data2(int x) {	// 매개변수가 있는 생성자
		value = x;
		System.out.println("Data2의 매개변수를 받는 생성자");
	}
}
public class ConstructorTeset {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(5);
		System.out.println("d1.value = " +d1.value);
		System.out.println("d2.value = " +d2.value);
	}

}

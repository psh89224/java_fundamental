
public class Test07 {
	
	public static void main(String[] args) {
		
		int a = 0 ;
		
		if ( a > 0 ) {
			System.out.println("a�� ����Դϴ�.");
		} else if ( a < 0) {
			System.out.println("a�� �����Դϴ�.");
		} else {									// else if ( a == 0 )
			System.out.println("a�� 0�Դϴ�");
		}
		
		System.out.println("a > 0 : " + (a>0));
		System.out.println("a < 0 : " + (a<0));
		System.out.println("a == 0 : " + (a==0));
	}

}

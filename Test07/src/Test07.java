
public class Test07 {
	
	public static void main(String[] args) {
		
		int a = 0 ;
		
		if ( a > 0 ) {
			System.out.println("a는 양수입니다.");
		} else if ( a < 0) {
			System.out.println("a는 음수입니다.");
		} else {									// else if ( a == 0 )
			System.out.println("a는 0입니다");
		}
		
		System.out.println("a > 0 : " + (a>0));
		System.out.println("a < 0 : " + (a<0));
		System.out.println("a == 0 : " + (a==0));
	}

}

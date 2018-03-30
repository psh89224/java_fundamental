
public class Continue01 {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i==7) {
				continue;	// 7이 제거되고 나머지 출력
			}
			System.out.print(i);
		}
	}

}

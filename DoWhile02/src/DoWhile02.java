import java.util.Scanner;
public class DoWhile02 {
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		int menu;
		
		do {
			System.out.println("1 : 파일 선택");
			System.out.println("2 : 파일 작성");
			System.out.println("3 : 파일 저장");
			System.out.println("4 : 파일 닫기");
			System.out.print("메뉴를 선택하세요.(1~4) : ");
			menu = sc.nextInt();
		} while(!(menu>=1 && menu<=4)); // while(menu<1 || menu>4)
		
		// System.out.println(menu + "번 메뉴가 선택 되었습니다.");
		switch(menu) {
		case 1:
			System.out.println("파일을 선택 하셨습니다.");
			break;
		case 2:
			System.out.println("파일을 작성 하셨습니다.");
			break;
		case 3:
			System.out.println("파일을 저장 하셨습니다.");
			break;
		case 4:
			System.out.println("파일을 닫으셨습니다.");
			break;
		}
				
		sc.close();
	}
}
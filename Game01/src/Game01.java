import java.util.Scanner;

public class Game01 {
	public static void main (String[] args ) {
		Scanner sc = new Scanner(System.in);
		String[] s = {"가위", "바위", "보"};
		int[] score = new int[3];	// 승패 카운트 저장
		String retry;				// 리게임 의사묻기
		
		System.out.print("가위바위보 게임");
		
		do {
			System.out.print("유저 입력(0-가위//1-바위//2-보) : ");
			int user = sc.nextInt();
			int com = (int)(Math.random() * 3);
			
			System.out.println("당신은 "+s[user]+"를 냈고, 컴퓨터는 "+s[com]+"를 냈습니다.");
			
			int result = (user - com + 3) % 3;
			switch(result) {
			case 1:
				System.out.println("당신이 승리 하였습니다.");
				++score[1];
				break;
			case 2:
				System.out.println("당신은 패배 하였습니다.");
				++score[2];
				break;
			case 0:
				System.out.println("비겼습니다.");
				++score[0];
			}
			System.out.print("한번 더 하시겠습니까?(y/n) : ");
			retry = sc.next();
			
		}while(retry.equalsIgnoreCase("y"));
		System.out.println(score[1]+"승"+score[0]+"무"+score[2]+"패");
		
		sc.close();
	}
}
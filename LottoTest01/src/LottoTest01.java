import java.util.Scanner;
import java.util.Random;

public class LottoTest01 {
	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int [] lotto = new int[6];
		
		System.out.print("정수입력(1~45) : ");
		int user = sc.nextInt();
				
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = r.nextInt(45)+1;		// 1~45까지의 숫자
			for(int j=0; j<i; j++) {		// 중복숫자 안뜨게 하기
				if(lotto[i] == lotto[j]) {
					i--;
					break;	
				}
			}
			 // System.out.println(lotto[i]);
		}
		// 버블 정렬 후
		for(int i=0; i<lotto.length-1; i++) {
			boolean checked = false;
			for(int j=0; j<lotto.length-1-i; j++) {
				if(lotto[j] > lotto[j+1]) {
					int t = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = t;
					checked = true;
				}
			}
			if(!checked) break;
		} 
		for(int i=0; i<lotto.length; i++) {
			if(user == lotto[i]) {
				System.out.println("행복하세요");
			}
		}
		System.out.print("[ ");
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println("]");
		sc.close(); 
	}

}

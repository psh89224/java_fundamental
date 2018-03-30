import java.util.*;

public class Isosceles_triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("밑 변 길이를 입력하세요 : " );
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<(num-1)-i; j++) {
				System.out.println(" ");								
			}
			for(int j=0; j<2*i+1; j++) {
				System.out.printf("*");
				}
			System.out.println("*");
		}	
		sc.close();
	}
}
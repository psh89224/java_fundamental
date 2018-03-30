import java.util.Scanner;

public class Test12 {
	
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		double avg = (double)sum/3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		String score;
		
		// 1번 방법 (if문)
		/*if ( avg >= 90) {
			score = "A";
		} else if ( avg >= 80) {
			score = "B"; 
		} else if ( avg >= 70) {
			score = "C"; 
		} else if ( avg >= 60)  { 
			score = "D";
		} else {
			score = "F";
		}*/
		
		// 2번 방법 (switch문)
		
		switch(sum/3) {
		case 90: case 91: case 92: case 93: case 94: case 95:
		case 96: case 97:case 98: case 99: case 100:
			score = "A";
			System.out.println("학점 : " + score);
		break;
		
		case 80: case 81: case 82: case 83: case 84: case 85: 
		case 86: case 87: case 88: case 89:
			score = "B";
			System.out.println("학점 : " + score);
		break;
		
		case 70: case 71: case 72: case 73: case 74: case 75: 
		case 76: case 77: case 78: case 79:
			score = "C";
			System.out.println("학점 : " + score);
		break;
		
		case 60: case 61: case 62: case 63: case 64: case 65: 
		case 66: case 67: case 68: case 69:
			score = "D";
			System.out.println("학점 : " + score);
		break;
		}
		
		sc.close();	
	}
	
}

import java.util.Scanner;

public class MethodTest08 {
	
	public static int getMax(int[] x) {
		int max = x[0];
		for(int i=1; i<x.length; i++) {
			if(max < x[i]) {
				max = x[i];
			}
		} return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 건강 체크 프로그램 ***");
		System.out.print("학생 수 입력 : ");
		int n = sc.nextInt();
		
		int[] height = new int[n];
		int[] weight = new int[n];
		int[] age = new int[n];

		
		for(int i=0; i<n; i++) {
			System.out.println("--- " + (i+1) + "번째 학생 ---");
			System.out.print("신장 입력 : ");
			height[i] = sc.nextInt();
			System.out.print("몸무게 입력 : ");
			weight[i] = sc.nextInt();
			System.out.print("나이 입력 : ");
			age[i] = sc.nextInt();			
		}
		
		int maxHeight = getMax(height);
		int maxWeight = getMax(weight);
		int maxAge = getMax(age);
		
		System.out.println("신장의 최대값 : " + maxHeight);
		System.out.println("체중의 최대값 : " + maxWeight);
		System.out.println("나이의 최대값 : " + maxAge);
		sc.close();
	}

}

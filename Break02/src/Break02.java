import java.util.Scanner;

public class Break02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int  i, sum=0;
		
		while(true) {
			System.out.print("정수입력(0을 입력하면 종료) : ");
			i=sc.nextInt();
			
				if (i==0) {
					break;
				}
				sum += i;
		}
		System.out.print("총 합은 : " + sum);
		sc.close();
	}

}

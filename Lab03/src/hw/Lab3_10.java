package hw;
import java.util.Random;

public class Lab3_10 {
	
	public static void main(String[] args) {
		// 4 x 4 배열 생성
		int n[][]=new int [4][4];
		Random random = new Random();
		// for문으로 10번 반복
		for (int i=0; i<10; i++) {
			// row에 해당하는 난수 생성 - 0~3
			int r = random.nextInt(4);
			// column에 해당하는 난수 생성 - 0~3
			int c = random.nextInt(4);;
			// if : 0이 아니라면 - 이미 2차원 배열 해당 row,column에 숫자가 존재한다면
			if (n[r][c] !=0) {
				// 하나의 iteration 다시 반복
				while(n[r][c] !=0) {
					// row에 해당하는 난수 생성 - 0~3
					r = random.nextInt(4);
					// column에 해당하는 난수 생성 - 0~3
					c = random.nextInt(4);;
				}
			}
			// 주의 - 계속해서 숫자가 존재하는 row, column이 나올 수 있음을 주의
			// else
			else {
				// 1~10 사이의 난수 생성
				int num = random.nextInt(10)+1;
				n[r][c]=num;
			}
		}
		// 2중 for문을 사용해서 출력
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				// 출력 : n[i][j] + "\t"
				System.out.print(n[i][j] + "\t");
			}
			// new line에 유의
			System.out.println();
		}
	}
}

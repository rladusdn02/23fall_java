package hw;
import java.util.Random;

public class Lab3_10 {
	
	public static void main(String[] args) {
		// 4 x 4 �迭 ����
		int n[][]=new int [4][4];
		Random random = new Random();
		// for������ 10�� �ݺ�
		for (int i=0; i<10; i++) {
			// row�� �ش��ϴ� ���� ���� - 0~3
			int r = random.nextInt(4);
			// column�� �ش��ϴ� ���� ���� - 0~3
			int c = random.nextInt(4);;
			// if : 0�� �ƴ϶�� - �̹� 2���� �迭 �ش� row,column�� ���ڰ� �����Ѵٸ�
			if (n[r][c] !=0) {
				// �ϳ��� iteration �ٽ� �ݺ�
				while(n[r][c] !=0) {
					// row�� �ش��ϴ� ���� ���� - 0~3
					r = random.nextInt(4);
					// column�� �ش��ϴ� ���� ���� - 0~3
					c = random.nextInt(4);;
				}
			}
			// ���� - ����ؼ� ���ڰ� �����ϴ� row, column�� ���� �� ������ ����
			// else
			else {
				// 1~10 ������ ���� ����
				int num = random.nextInt(10)+1;
				n[r][c]=num;
			}
		}
		// 2�� for���� ����ؼ� ���
		for (int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				// ��� : n[i][j] + "\t"
				System.out.print(n[i][j] + "\t");
			}
			// new line�� ����
			System.out.println();
		}
	}
}

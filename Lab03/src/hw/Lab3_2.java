package hw;

public class Lab3_2 {

	public static void main(String[] args) {
		// 2���� �迭 �ʱ�ȭ : { { 1 }, { 1, 2, 3 }, { 1 }, { 1, 2, 3, 4 }, { 1, 2 } }
		int n [][]={ { 1 }, 
					 { 1, 2, 3 }, 
					 { 1 }, 
					 { 1, 2, 3, 4 }, 
					 { 1, 2 } };
		
		// 2�� for�� �� �迭�� ���̸� ����Ͽ� ��� 
		for (int i=0; i<n.length; i++) {
			for (int j=0; j<n[i].length; j++)
				// ��� : (n[i][j] + "\t")
				System.out.print(n[i][j]+"\t");
				// new line�� ����
				System.out.println();
		}
	}
}

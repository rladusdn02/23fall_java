package hw;

import java.util.Scanner;

public class Lab3_8 {

	public static void main(String[] args) {
		// Scanner ��ü ����
		Scanner scan=new Scanner(System.in);
		// ��� ("���� �? ")
		System.out.print("���� �? ");
		// size �Է¹ޱ�
		int size=scan.nextInt();
		// size ũ���� �迭 ����
		int int_arr[]=new int[size];
		// new �����ڸ� ����ϸ� boolean �迭�� false�� �ʱ�ȭ ��
		// check �迭�� ���� ���� ���� �ִ��� Ȯ��
		boolean check[] = new boolean[101];
		int count = 0; // ������ ������ ������ ���� ����
        // �ݺ��� ���
        while (count < size) {
            // ���� ����
            int r = (int) (Math.random() * 100);

            if (!check[r]) {
                // �̹� ������ ���ڰ� �ƴ϶��
                check[r] = true; // �����Ǿ��ٰ� ǥ��
                int_arr[count] = r; // �迭�� ����
                count++;

                // ������ ���� ���
                System.out.print(r + "\t");

                if (count % 10 == 0) {
                    // 10��° ���� �� �� �ٲ�
                    System.out.println();
                }
            }
        }
        // Scanner �ݱ�
        scan.close();
    }
}

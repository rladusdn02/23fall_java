package exercise;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		//Scanner ��ü ����
		Scanner scan=new Scanner(System.in);
		//��� ("������ �Է��Ͻÿ� >> ");
		System.out.print("������ �Է��Ͻÿ� >> ");
		//����ڷκ��� ���� �Է� �ޱ�		
		int num = scan.nextInt();
		//2�� for�� ���
		for (int i = num; i > 0; i--) {
			for (int j=i; j>0;j--) {
				System.out.print("*");
			}
			//new line
			System.out.println();
		}
		
		//Scanner �ݱ�
		scan.close();
	}

}

package exercise;

import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		// Scanner ��ü ����
		Scanner scan=new Scanner(System.in);
		// size 10 �� �迭 ����
		int num[]=new int [10];
		// ��� ("���� ���� 10���� �Է��Ͻÿ� >> ");
		System.out.print("���� ���� 10���� �Է��Ͻÿ� >> ");
		// for������ 10���� ���� ���� �Է¹ޱ�
		for(int i=0; i<10; i++) {
			num[i]=scan.nextInt();
		}
		// ��� ("3�� ����� ");
		System.out.print("3�� ����� ");
		// for, if���� ����ؼ� 3�� ��� ���
		for(int i=0; i<10; i++) {
			if(num[i] % 3==0)
				System.out.print(num[i]+" ");
		}
		// Scanner �ݱ�
		scan.close();
	}

}

package hw;

import java.util.Scanner;

public class Lab3_4 {

	public static void main(String[] args) {
		//Scanner ��ü ����
		Scanner scan=new Scanner(System.in);
		//��� ("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ� >> ")
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ� >> ");
		//scan.next()�� ����Ͽ� ���ڿ� �Է¹ޱ�
		String string=scan.next();
		//string.charAt(0)�� ����Ͽ� ���ڿ��� ù ��° ����(�ҹ��� ���ĺ� �ϳ�)�� ������ ����
		char c=string.charAt(0);
		//if�� - string ���̰� 1�� �ƴϸ�
		if (string.length()!=1) {
			//��� ("���ĺ� �ϳ��� �Է��ؾ� �մϴ�!")
			System.out.print("���ĺ� �ϳ��� �Է��ؾ� �մϴ�!");
		}	
		//else
		else {
			//if - character�� ���ĺ� �ҹ������� Ȯ��
			if (Character.isLowerCase(c)) {
				//2�� for���� ���ؼ� ������ ���� ���
				for (int i=0; i<=c-'a';i++) {
					for (char j='a'; j<=c-i; j++) {
						System.out.print(j);
					}
					//��� ()
					System.out.println();
				}
			}	
				//else 
			else {
				System.out.print("�ҹ��� ���ĺ��� �ƴմϴ�.");
			}
		}
		//Scanner ��ü �ݱ�
	scan.close();
	}
}

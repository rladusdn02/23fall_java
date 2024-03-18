import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		// scanner ��ü ����
		Scanner scan = new Scanner(System.in, "UTF-8");
		// ����ڿ��� ���� ���� ���� ũ�⸦ �ޱ� ���� ���, �Է�
		System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		int n = scan.nextInt();
		
		// n���� ���ڿ��� ���� ������ StringStack ����
		StringStack ss = new StringStack(n); 
		
		// while��
		while (true) {
			// ����ڿ��� ���ڿ� �Է��� �ޱ� ���� ���, �Է�
			System.out.print("���ڿ� �Է� >> ");
			// '�׸�'�� �Է� ������ while �� ����
			String str = scan.next();
			if (str.equals("�׸�")) {
				break;
			}
			// str ���ÿ� ����
			boolean res = ss.push(str);
			// ������ �� á�ٸ� Ǫ�� �Ұ� ���
			if(res == false) {
				System.out.println("������ �� ���� Ǫ�� �Ұ� !");
			}
		}
		// ��� ("���ÿ� ����� ��� ���ڿ� �� : ")
		System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
		// ���� ���ÿ� ����� ���ڿ� ����
		int len = ss.length(); 
		// ���ÿ� ����� ������ŭ ����
		for(int i=0; i<len; i++) {
			// ���ÿ��� ���Ͽ� ���
			System.out.print(ss.pop() + " ");
		}
		
		// scanner �ݱ�
		scan.close();
	}
}

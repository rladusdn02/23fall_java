import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListScore {
	public static void main(String[] args) {	
		// Scanner ��ü ����
		Scanner scan = new Scanner(System.in);
		// character type �� ArrayList �������ֱ�
		ArrayList<Character> a = new ArrayList<Character>(5);
		// ��¹� "6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F) >> "
		System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F) >> ");
		for (int i = 0; i < 6; i++) {
			// ��ĳ�� �̿��ؼ� Character �ϳ� �޾ƿ��� --> hint : charAt(0);
			char c = scan.next().charAt(0);
			// ArrayList �� �޾ƿ� �� �߰����ֱ�
			a.add(c);}
		// ���� �հ� ���� ���� ���� double type - �ʱ�ȭ
		double sum=0;
		// ArrayList ũ�⸸ŭ �ݺ��ϸ鼭
		for(int j=0; j<a.size(); j++) {
			// ArrayList �� ���� ���� �ϳ��� �޾ƿ�
			char grade = a.get(j);
			// �޾ƿ� ���� A,B,C,D,F ������ ���� �հ� ������ �ش� ���� �����ֱ� 
			double score=0;
			// --> HINT : switch ���̳� if �� ����
			switch (grade) {
				case 'A' : score=4.0;break;
				case 'B' : score=3.0;break;
				case 'C' : score=2.0;break;
				case 'D' : score=1.0;break;
				case 'F' : score=0.0;break;}
			sum=sum+score;}
		// ���������� ��� ���ϱ� (�հ� ���� / ArrayList �� ũ��)
		double avg = (sum)/(a.size());
		System.out.println(avg);
		System.out.println("�迬�� 2211366");
		// Scanner ��ü �ݱ�
		scan.close();
	}
}

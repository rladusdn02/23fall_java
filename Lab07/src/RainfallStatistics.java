import java.util.Scanner;
import java.util.Vector;

public class RainfallStatistics {
	public static void main(String[] args) {
		// Scanner ��ü ����
		Scanner scan = new Scanner(System.in);
		// Integer type Vector ���� ����
		Vector<Integer> v = new Vector<Integer>();
		while(true) {
			// ��¹� "������ �Է� (0 �Է½� ����) >> "
			System.out.print("������ �Է� (0 �Է½� ����) >> ");
			// ������ �Է¹ޱ�
			int rainfall=scan.nextInt();
			// �Է� ���� ������ == 0 --> ����������(while �� ���� ����)
			if (rainfall==0){
				break;}
			// ������ ���Ϳ� �߰�
			v.add(rainfall);
			// �հ� ���� = 0
			int sum=0;
			// ���� ������ ��ŭ ���鼭 �� ���� ���� ��� + ��� ���ϱ� ���� �հ� ���ϱ�
			for (int i=0; i<v.size(); i++) {
				int n = v.get(i);
				System.out.print(n+"\t");
				sum=sum+n;
			}
			// ���������� �հ踦 �̿��Ͽ� ��� ���ϱ�(������ size �Լ� �̿�) -> ���
			double avg=((double)sum)/(v.size());
			System.out.println("\n���� ��� "+avg);
		}
		System.out.println("�迬�� 2211366");
		// Scanner ��ü �ݱ�
		scan.close();
	}
}


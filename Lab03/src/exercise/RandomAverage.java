package exercise;

public class RandomAverage {

	public static void main(String[] args) {
		// size 10 �� �迭 �����ϱ�
		int num[]=new int[10];
		// sum ���� �ʱ�ȭ
		int sum=0;
				
		// for��, (int)(Math.random()) ����ؼ� 1~10�� ���� �����ϰ� ����
		for (int i=0; i<10; i++) {
			num[i]=(int)(Math.random()*10+1);
		}
		// ��� ("������ ������ : ")
		System.out.print("������ ������ : ");
		// for���� ����ؼ� ������ �� ���ϱ�, ���� ����ϱ�/
		for (int i=0; i<num.length; i++) {
			sum+=num[i];
			System.out.print(num[i]+" ");
			}	
		
		//newline System.out.println();
		// ��� ("����� " + ���)
		System.out.print("\n����� " + (double) sum/num.length);
	}
}
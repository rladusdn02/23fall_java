
public class StringStack implements Stack { //Stack�� �������̽��̱⶧���� implements�� �ҷ���.
	// String ���� �迭 - ���� > ���� ���� ����
	private String[] element;
	
	// index, top of stack ����
	private int tos;
	
	// ������ -> �Ű������� stack capacity
	public StringStack(int capacity) {
		element = new String [capacity];
		tos = -1;
	}
	
	// Stack �������̽��� ����� ���� 4���� �޼ҵ� �������̵� ����
	
	// 1. ���� ���ÿ� ����� ���� �����ϴ� �޼ҵ�
	public int length() {
		return tos +1;
	}
	
	// 2. ���� capacity ����
	public int capacity() {
		return element.length;
	}
	
	// 3. pop �޼ҵ� ���� - ���� ����� �� ó��
	public String pop() {
		
		// ������ ����� - null return
		if(tos == -1) {
			return null;
		}
		// top�� �ִ� ��
		String s = element[tos];
		// ���� ������ ����
		tos --;
		// ���Ϲ� 
		return s;
	}

	// 4. push �޼ҵ� ���� - ������ �� á�� �� ó��
	public boolean push(String val) {
		// ������ �� á�� - false return
		if (tos == element.length-1) {
			return false;
		}
		else { 
			// ���� ������ ����
			tos++;
			// ��� ���ÿ� ����
			element[tos]=val;
			//true ����		
			return true;
		}
	}
}

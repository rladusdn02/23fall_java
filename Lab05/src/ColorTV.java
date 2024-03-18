
public class ColorTV extends TV { // extends ��ӹ��� �θ� Ŭ����
	// ���� ���� ���� ����(color) ���� (private)
	private int color;
	
	// ������ -> ������ ����, ���� �� ����
	public ColorTV(int size, int color) {
		super(size);
		this.color=color;
	}
	
	// getColor �Լ� -> ���� �� ��ȯ
	public int getColor() {
		return color;
	}
	
	// printProperty �Լ� -> "x ��ġ y �÷�" return
	public void printProperty() {
		System.out.println(getSize() + "��ġ" + getColor() + "�÷�");
	}
	
	
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	}

}

public class Won2Dollar extends Converter{ // extends ��ӹ��� �θ� Ŭ����
	// ������ --> ȯ�� ����
	public Won2Dollar (double ratio) {
		super.ratio = ratio;
	}
	
	// ���� ��ȯ �Լ�(convert) ����
	protected double convert(double src) {
		return (src / ratio);
	}
	
	// ���� ������ srcString()
	protected String srcString() {
		return "��";
	}
	
	// �ٲ� ������ destString()
	protected String destString() {
		return "�޷�";
	}
	
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}

}

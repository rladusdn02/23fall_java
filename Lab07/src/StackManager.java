import java.util.Vector;

interface IStack<T> {
	T pop();
	boolean push(T ob);
}

class MyStack<T> implements IStack<T> {
	// ���� Vector ���� ����
	private Vector<T> v;
	// ������ - Vector�� �� �� ����
	MyStack(){
		v = new Vector<T>();
	}
	// Override 1
	// pop �Լ� (���� Ÿ�� T) -> Vector�� size() �Լ��� get() �Լ��� �̿��Ͽ� pop �Լ� ����
	public T pop() {
		int size = v.size();
		if(size>0) {
			T get = v.get(size-1);
			v.remove(size-1);
			return get;
		}
		else return null;
	}
	

	// Override 2
	// push �Լ� (����Ÿ�� boolean, �Ű����� T Ÿ��) -> Vector �� add()�Լ� �̿��ϱ�
	public boolean push(T ob) {
		return v.add(ob);
	}
}

public class StackManager {
	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();

		for (int i = 0; i < 10; i++)
			stack.push(i);

		while (true) {
			Integer n = stack.pop();
			if (n == null)
				break;
			System.out.print(n + " ");
		}
	}
}

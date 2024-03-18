
public class StringStack implements Stack { //Stack는 인터페이스이기때문에 implements로 불러옴.
	// String 저장 배열 - 선언 > 스택 저장 공간
	private String[] element;
	
	// index, top of stack 선언
	private int tos;
	
	// 생성자 -> 매개변수는 stack capacity
	public StringStack(int capacity) {
		element = new String [capacity];
		tos = -1;
	}
	
	// Stack 인터페이스에 선언된 다음 4개의 메소드 오버라이딩 구현
	
	// 1. 현재 스택에 저장된 개수 리턴하는 메소드
	public int length() {
		return tos +1;
	}
	
	// 2. 스택 capacity 리턴
	public int capacity() {
		return element.length;
	}
	
	// 3. pop 메소드 구현 - 스택 비었을 때 처리
	public String pop() {
		
		// 스택이 비었음 - null return
		if(tos == -1) {
			return null;
		}
		// top에 있는 값
		String s = element[tos];
		// 스택 포인터 감소
		tos --;
		// 리턴문 
		return s;
	}

	// 4. push 메소드 구현 - 스택이 꽉 찼을 때 처리
	public boolean push(String val) {
		// 스택이 다 찼음 - false return
		if (tos == element.length-1) {
			return false;
		}
		else { 
			// 스택 포인터 증가
			tos++;
			// 요소 스택에 저장
			element[tos]=val;
			//true 리턴		
			return true;
		}
	}
}

package hw;

public class Rectangle {

	// private 변수 - int 타입의 x, y, width, height
	private int x;
	private int y;
	private int width;
	private int height;
	
	
	// x, y, width, height 값을 매개변수로 받아 필드를 초기화 하는 생성자
	public void rectangle(int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	
	
	// int square() : 메소드 - 사각형의 넓이 리턴
	public int square() {
		return x*y;
	}
	
	// void show(): 메소드 -   사각형의 좌표와 넓이를 화면에 출력
	public void show() {
		System.out.println(+"에서"+"크기가"+square+"인 직사각형");
	}
	
	//boolean contains(Rectangle r): 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
	
	public static void main(String[] args) 
	{
		// 실습 자료의 메인 함수와 동일
	}

}

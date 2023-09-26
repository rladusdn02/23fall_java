package hw;

public class Rectangle {

	// private 변수 - int 타입의 x, y, width, height
	private int x;
	private int y;
	private int width;
	private int height;
	
	
	// x, y, width, height 값을 매개변수로 받아 필드를 초기화 하는 생성자
	public Rectangle(int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	
	
	// int square() : 메소드 - 사각형의 넓이 리턴
	public int square() {
		return width*height;
	}
	
	// void show(): 메소드 -   사각형의 좌표와 넓이를 화면에 출력
	public void show() {
		//Rectangle rect = new Rectangle();
		System.out.println("("+x+","+y+")"+"에서"+"크기가"+square()+"인 직사각형");
	}
	
	//boolean contains(Rectangle r): 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
	public boolean contains (Rectangle r) {
		
	}
	
	public static void main(String[] args) 
	{
		// 실습 자료의 메인 함수와 동일
		System.out.println("2211366 김연우");
		
		 Rectangle rec1 = new Rectangle(2,2,8,7);
		 Rectangle rec2 = new Rectangle(5,5,6,6);
		 Rectangle rec3 = new Rectangle(1,1,10,10);
		 
		rec1.show();
		
		System.out.println("rec2의 면적 : " + rec2.square());
		
		if(rec3.contains(rec1)) {
			System.out.println("rec3는 rec1을 포함합니다.");
		}
		
		if(rec3.contains(rec2)) {
			System.out.println("rec3는 rec2을 포함합니다.");
		}
	}

}

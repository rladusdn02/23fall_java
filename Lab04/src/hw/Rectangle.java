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
		System.out.println("("+x+","+y+")"+"에서 크기가 "+square()+"인 직사각형");
	} 
	
	//boolean contains(Rectangle r): 매개변수로 받은 r이 현 사각형 안에 있으면 true 리턴
	public boolean contains (Rectangle r) {
		//여기를 처리해
		if (x<r.x && y<r.y && (x+width) > (r.x +r.width) && (y+height)>(r.y+r.height)){
			return true;
		}
		return false;
	}
	public static void main(String[] args) 
	{
		// 실습 자료의 메인 함수와 동일
		 Rectangle r = new Rectangle(2,2,8,7);
		 Rectangle s = new Rectangle(5,5,6,6);
		 Rectangle t = new Rectangle(1,1,10,10); 
		r.show();
		System.out.println("s의 면적 : " + s.square());
		if(t.contains(r)) {
			System.out.println("t는 r을 포함합니다.");
		}
		if(t.contains(s)) {
			System.out.println("t는 s을 포함합니다.");
		}
		System.out.println("2211366 김연우");
	}
}
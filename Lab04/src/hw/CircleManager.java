package hw;
import java.util.Scanner;
class Circle
{
	// double 형 x, y 변수
	private double x,y;
	// 반지름 변수
	private int r;
	
	// Circle 생성자 (파라미터 - x, y, 반지름)
	public Circle(double x, double y, int r) {
		this.x=x;
		this.y=y;
		this.r=r;
	}	
	// show 함수 ()
	public void show() {
		System.out.print("("+x+","+y+") "+r);
	}
	// getArea() 함수 : 면적 구하는 함수 추가 정의
	public int getArea() {
		int area = r*r;
		return area;
	}
}
public class CircleManager 
	{
	public static void main(String[] args) 
	{
		// Scanner 객체 선언
		Scanner scan = new Scanner(System.in);
		// 3개의 Circle 배열 선언
		Circle c []= new Circle[3];
		// 가장 큰 면적을 저장할 변수
		double maxArea = 0;
		// 가장 큰 면적을 가지는 객체의 index를 저장할 변수
		int maxIndex = 0;
//		for(int i = 0; i<Circle 배열 길이; i++) {
//			System.out.print("x, y, radius >>");
		for(int i = 0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			// x 값 읽기
			double x=scan.nextDouble();
			// y 값 읽기
			double y=scan.nextDouble();
			// 반지름 읽기
			int r=scan.nextInt();
			// c[i] = ... //  Circle 객체 생성(hint : 생성자)
			c[i] = new Circle(x,y,r);
		}	
//		for(int i = 0; i < c.length; i++)
		for(int i = 0; i < c.length; i++) {
			double area = c[i].getArea();
		//  getArea()메소드 사용하여 면적이 최대값인지 확인 후 max/maxidx update 
			if(area > maxArea) {
				maxArea=area;
				maxIndex=i;
				}
			}
			// 실행결과 참고 - show() 함수와 getArea()함수 사용하여 출력
//			+c[maxIndex].getX()+","+c[maxIndex].getY()+") "+c[maxIndex].getR()
			System.out.print("가장 면적이 큰 원은 ");
			c[maxIndex].show();
			System.out.println("이며, 면적은 "+(int)maxArea+"입니다.");
			System.out.println("김연우 2211366");
		
		// Scanner 닫기
		scan.close();
	}
   }
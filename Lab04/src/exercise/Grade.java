package exercise;
import java.util.Scanner;

public class Grade 
{
	// 수학, 과학, 영어 점수 변수 선언
	
	// Grade 생성자 (파라미터로 수학, 과학, 영어 가짐)
	
	// 평균 구하는 함수 선언
	
	public static void main(String[] args)
	{
		// 실습 자료의 메인 함수와 동일
		Scanner scan = new Scanner(System.in);
		System.out.print("수학, 과학, 영어를 순서대로 입력하시오. (단, 정수형) : ");
		
		int i_math = scan.nextInt();
		int i_science = scan.nextInt();
		int i_english = scan.nextInt();
		// 사용자의 입력으로부터 받아온 점수를 가지고 객체 생성
		
		Grade G_me;
		// Grade 클래스의 메소드를 가지고 평균 출력
		
		scan.close();
	}
}
 	

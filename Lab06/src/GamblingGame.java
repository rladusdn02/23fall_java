import java.util.Random;
import java.util.Scanner;

class Person {
	// 이름 변수 String, private
	private String name;
	// Person 생성자 - param (이름)
	public Person(String name) {
		this.name=name;
	}
	// getName 함수 - return String;
	public String getName() {
		return name;
	}
}

public class GamblingGame {
	// Scanner 객체 선언
	Scanner scan = new Scanner(System.in);
	// Person 배열 생성 - 크기 2
	Person [] person = new Person[2];
	// 랜덤 객체 선언
	Random random = new Random();

	public void setting() {
		// "1번째 선수 이름 >> " 출력
		System.out.print("1번째 선수 이름 >> ");
		// 이름 입력
		String name1 = scan.next();
		// 생성자 이용해서 첫번째 선수 이름 세팅
		person[0]=new Person(name1);
		// "2번째 선수 이름 >> " 출력
		System.out.print("2번째 선수 이름 >> ");
		// 이름 입력
		String name2 = scan.next();
		// 생성자 이용해서 두번째 선수 이름 세팅
		person[1]=new Person(name2);
		
	}
	public void run() {
		setting();
		// 승리를 의미하는 boolean 변수 선언
		//초기화
		boolean victory = false;
		scan.nextLine();
		while (true) {
			// for 0 to person 길이만큼{
			for (int i = 0; i<person.length; i++) {
				// 이름 + 엔터 출력
				System.out.print("["+person[i].getName()+"] : <Enter>");
				// 키 입력받기 nextLine
				scan.nextLine();
				// 세개의 랜덤 변수 생성
				int randomNum1 = random.nextInt(3);
				int randomNum2 = random.nextInt(3);
				int randomNum3 = random.nextInt(3);
				// 랜덤 변수 출력
				System.out.print("\t"+randomNum1 +" "+ randomNum2 +" "+ randomNum3);
				// 세 수가 모두 동일하다면
				if ((randomNum1 == randomNum2) && (randomNum2 == randomNum3)) {
					// 승리 출력 & 표시 for 빠져나가기.
					victory=true;
				System.out.println(" "+person[i].getName()+"(이)가 이겼습니다.");
				break;
				}
				// 아니라면
				else {
					//아쉽군요! 출력
					System.out.println(" 아쉽군요!");
				}
			}
			// if - for 에서 승리한 경우
			if (victory) {
			// 스캐너 닫고 while 나가기
			scan.close();
			break;}
		}
	}
	public static void main(String[] args) {
		GamblingGame gg = new GamblingGame();
		gg.run();
	}
}
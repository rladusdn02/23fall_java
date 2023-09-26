package hw;

import java.util.Scanner;

class Player {
	// 이름 변수 선언
	
	// 생성자 (파라미터 : 이름)
	

	// getName() 함수
}


public class WordGameApp
{
	// Scanner 객체
	
	// Player 배열 선언
	
	// 현재 단어 저장하는 변수 선언(끝말잇기 시작단어) ex : String currentWord="아버지"

	// beforSetting() 함수 선언
	public void beforeSetting() 
	{
		// 게임 시작 출력
		
		// 게임 참가 인원 입,출력
		
		
		// Player 배열 선언
		
		// 입력받은 인원 수 만큼 이름 입력 받은 다음 player 정보 세팅 -> 생성자 이용
	}


	// start 함수 선언
	public void start()
	{
		// 졌을 경우를 나타내는 boolean 변수(lose)
		
		while (true) 
		{
			// player 를 번갈아가면서 수행
			
			// getName 사용하여 선수 이름 출력
		
			// 단어 입력
		
			// if(...) --> 현재 단어와 입력 받은 단어의 첫글자와 동일한지 -> substring() 사용
		
				// 동일하다면 현재 단어를 입력받은 단어로 변경
		
			// else
		
				// 패배. 출력
		
				// lose 를 true 로 변경
		
				// for 빠져나가기
		
		// lose 가 true 이면  while loop break과  scanner 닫기
		
		}
	}
	
	
	public static void main(String[] args) 
	{
		WordGameApp wordGameApp = new WordGameApp();
		wordGameApp.beforeSetting();
		wordGameApp.start();
	}

}

package hw;

import java.util.Scanner;

class Phone 
{
	// 이름, 전화번호 필드
	
	// 생성자 (파라미터 : 이름, 전화번호)
	
	// get 함수 정의 (2개 : 이름, 전화번호 각각) - getName(), getNum()
}


public class PhoneBook 
{
	// Scanner 객체 선언
	// Phone 배열 선언

	// input 함수
	private void input() 
	{
		// 인원수 입,출력
		
		int i_size;
		// 인원수만큼의 Phone 배열 선언
		
		// 인원수만큼의 이름과 전화번호 입력받기
		
		// 저장완료 출력
	}

	
	private void search(String searchName) 
	{	
		// phone 배열 길이만큼 돌면서 해당 이름이 있는지 확인 후 출력
		
		// 이름이 있으면 '이름' + "의 전화번호 : " + 전화번호
	
		// 이름이 없으면 '이름' + " 없음."
	}

	public void runCommand() 
	{
		input();
		
		while (true) 
		{
			// 검색할 이름 입력
			
			// 입력한 단어가 "stop" 인지 확인
			
			// "stop" 인 경우 종료
			
			
			// 아닌 경우, search(searchName) 함수 실행
		}
	}
	
	
	public static void main(String[] args) 
	{
		PhoneBook phonebook = new PhoneBook();
		phonebook.runCommand();
	}

}

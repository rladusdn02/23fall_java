import java.util.Scanner;

public class WordReplace {

	public static void main(String[] args) {
		// ">>" 출력
		System.out.print(">>");
		//Scanner 객체 생성
		Scanner scan = new Scanner(System.in, "UTF-8");
		// 한 라인을 문자열로 읽기
		String text = scan.nextLine();
		// StringBuffer 객체 생성 -> 입력 받은 문자열
		StringBuffer sb = new StringBuffer(text);
		
		// while문
		while(true) {
			// "명령: " 출력
			System.out.print("명령: ");
			// 한 라인을 문자열로 읽기
			String cmd = scan.nextLine();
			// "그만"을 입력하면 종료
			if(cmd.equals("그만")) {
				System.out.print("종료합니다");
				break;
			}
			// 입력 받은 문자열(명령)을 ! 기준으로 split해서 String 배열에 저장 (첫 번째 token = 찾을 문자열, 두 번째 token = 바꿀 문자열)
			String [] tokens = cmd.split("!");
			// 배열에 저장된 token이 2개가 아니면 "잘못된 명령입니다!" 출력
			if (tokens.length != 2)
				System.out.println("잘못된 명령입니다!");
			// else
			else {
				// 첫 번째 token의 길이가 0이거나 두 번째 token의 길이가 0이면 "잘못된 명령입니다!" 출력
				if (tokens[0].length() == 0 || tokens[1].length() == 0) {
					System.out.println("잘못된 명령입니다!");
					continue;
				}
				// indexOf 함수 이용 -> 입력 문자열에서 첫 번째 token의 index 찾아서 저장 
				int index = sb.indexOf(tokens[0]);
				//첫 번째 token을 찾을 수 없다면 "찾을 수 없습니다!" 출력
				if (index == -1) {
					System.out.println("찾을 수 없습니다!");
					continue;
				}
				sb.replace(index, index + tokens[0].length(), tokens[1]);
				System.out.println(sb.toString());
			}
		}
		//scanner 닫기
		scan.close();
		
	}

}
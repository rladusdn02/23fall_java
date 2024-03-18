import java.util.Scanner;

public class RotationString {

	public static void main(String[] args) {
		// Scanner 객체 선언
		Scanner scan = new Scanner(System.in);
		// 문자열 입력 .. 됩니다 출력.
		System.out.println("문자열 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
		// 문자열 입력 받기 nextLine
		String st = scan.nextLine();
		// 문자열 길이 구해서 저장하기
		int len = st.length();
		// for 0 to 문자열 길이만큼
		for (int i=1; i<len; i++) {
		// 현재 문자열에서 첫글자 가져오기
		String f = st.substring(i);
		// 나머지 글자 다 가져오기
		String all = st.substring(0, i);
		// 문자열 = 나머지글자 + 첫글자
		String s = f + all;
		// 문자열 출력
		System.out.println(s);
		}
		// 스캐너 닫기
		scan.close();
	}
}
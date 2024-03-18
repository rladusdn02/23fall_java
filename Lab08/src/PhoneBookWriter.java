import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PhoneBookWriter {

	public static void main(String[] args) {
		// Scanner 객체 선언
		Scanner scan = new Scanner(System.in, "UTF-8");
		// File 생성 - "C:/classJava/2000000_JAVA/Lab08/phone.txt" --> 본인 워크스페이스에 맞게 설정
		File file = new File("/Users/kim-yeonwoo/Desktop/classJava/2211366_Java/Lab08/Lab08/phone.txt");
		// FileWriter 선언 - 초기화:null
		FileWriter fw = null;
		try {
			// 출력 "전화번호 입력 프로그램입니다."
			System.out.println("전화번호 입력 프로그램입니다.");
			// fileWriter 사용해서 file 읽어오기
			fw = new FileWriter(file);
			// while(true){
			while(true) {
				// 출력 "이름 전화번호 >>"
				System.out.print("이름 전화번호 >>");
				// 입력 받기 nextLine
				String str = scan.nextLine();
				// 입력 값 == "그만" --> break;
				if(str.equals("그만"))
					break;
				// fileWriter에 받아온 값 + "\n" 쓰기
				fw.write(str+"\r\n");
			// }
			}
			// 출력 "C:/classJava/2000000_JAVA/Lab08/phone.txt 에 저장하였습니다." --> 본인 워크스페이스에 맞게
			System.out.println("/Users/kim-yeonwoo/Desktop/classJava/2211366_김연우/Lab08/Lab08/phone.txt 에 저장하였습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// fileWriter != null --> fileWriter.close() & Scanner close()  with try&catch
			if (fw != null) {
				try {
					fw.close();
					scan.close();
				}
				catch(IOException e) {
					
				}
			}
		}
	}

}

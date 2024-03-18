import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
public class PhoneFinder {
	public static void main(String[] args) {
		// Scanner 객체 선언
		Scanner scan = new Scanner(System.in, "UTF-8");
		// HashMap 객체 생성 
		HashMap<String, String> map = new HashMap<String, String>();
		// File - "C:/classJava/2000000_JAVA/Lab08/phone.txt" 생성
		File file = new File("/Users/kim-yeonwoo/Desktop/classJava/2211366_Java/Lab08/Lab08/phone.txt");
		// FileReader 선언 - 초기화:null
		FileReader fr = null;
		try {
			// fileReader 로 file 읽어오기
			fr = new FileReader(file);
			// Scanner 이용해서 File 바로 읽어오기
			// hint --> System.in to fileReader
			Scanner fscan = new Scanner(fr);
			// while ... scanner 값.hasNext() {
			while(fscan.hasNext()) {
				// name = scanner.next() 값 받기
				String name = fscan.next();
				// tel = scanner.next() 값 받기
				String tel = fscan.next();
				// hashMap 에 넣기 (name, tel)
				map.put(name, tel);
			// }
			}
			// scanner 닫기
			fscan.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 출력 "총 " + hashMap.size() + "개의 전화번호를 읽었습니다."
			System.out.println("총 " + map.size() + "개의 전화번호를 읽었습니다.");
		}
		// while(true){
		while(true) {
			// 출력 "이름 >> "
			System.out.print("이름 >> ");
			// 이름 입력
			String name = scan.nextLine();
			// 이름 == "그만" ? break;
			if(name.equals("그만")) {break;}
			// hashMap에서 받아온 이름으로 검색 != null
			if (map.get(name)!=null)
				// hashMap으로 부터 받아와서 출력 "전화번호 : " + hashMap.get(name)
				System.out.println("전화번호 : " + map.get(name));
			// else (==null)
			else {
				// 출력 "찾는 이름이 없습니다."
				System.out.println("찾는 이름이 없습니다.");}
		//}
		}
		System.out.println("김연우 2211366");
		// scanner 닫기
		scan.close();	
	}
}


import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CustomerPoint {
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		// 회원 이름(string), 회원의 포인트 값(integer) type 의 HashMap 생성
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		// set 이용하여 HashMap 의 키 값 받아올 set 선언
		Set<String> set = map.keySet();
		// Iterator 이용하여 차례대로 키 값 받아올 준비
		Iterator<String> it = set.iterator();
		// 출력 "** 포인트 관리 프로그램입니다 **"
		System.out.println("** 포인트 관리 프로그램입니다 **");
		while (true) {
			// 출력문 "\n 이름과 포인트 입력 >> "
			System.out.print("\n이름과 포인트 입력 >> ");
			// 이름 받아오기
			String name = scan.next();
			// 이름 == "그만" ? --> break;
			if (name.equals("그만")) {break;}
			// 포인트 입력
			int point = scan.nextInt();
			// 해당 이름 가진 고객이 있는지 HashMap 에서 찾기
				// 고객이 존재한다면 --> HashMap에 해당 고객의 기존 포인트값에 입력받은 포인트값 더해줌
			if(map.containsKey(name)) {
				int sum = map.get(name);
				map.put(name, map.get(name)+point);}
			// 고객이 존재하지 않는다면 --> HashMap에 고객의 이름, 고객의 포인트 값 추가해주기.
			else map.put(name,point);
			// HashMap 에서 Key 값 받아오기 -> 위에서 정의해준 Set 변수 사용하기
			// iterator 역시 위에서 정의한 변수로 다시 정의해주기
			Iterator<String> it1 = set.iterator();
			while(it1.hasNext()) { // iterator 가 다음 값을 가진 다면 -> hasNext() 이용
				// iterator 로 부터 Key 값(이름) 받아오기
				String key = it1.next();
				// HashMap 으로 부터 Key 값(이름) 이용해서 포인트 값 가져오기
				int value = map.get(key);
				// (이름, 포인트) 형태로 출력
				System.out.print("("+key+", "+value+")");
			}
		}
		System.out.println("김연우 2211366");
		// Scanner 객체 닫기
		scan.close();
	}
}


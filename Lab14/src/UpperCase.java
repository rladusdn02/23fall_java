import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Kim", "Park", "He", "I", "Lee", "Hello", "World");

		//리스트 -> 스트림 객체 생성 --> 길이 3 이상인 문자열만 필터링(filter() **람다식 사용)
		String upper = list.stream()
				.filter(s -> s.length()>=3)
		//--> map() 사용하여 매핑(대문자로) **메소드 참조 형식
				.map(String::toUpperCase)
		//=> collect() 이용하여 결과 생성 (띄어쓰기로 연결 - joining 이용)
				.collect(Collectors.joining(" "));
		
		//결과 출력
		System.out.println(upper);
	}

}
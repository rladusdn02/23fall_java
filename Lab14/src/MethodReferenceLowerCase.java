import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodReferenceLowerCase {
 
	public static void main(String[] args) {
		List<String> listOfNames = Arrays.asList(new String[] {"Apple","Banana","Cherry"});
		
		//람다식 구현
		
		//Function 인터페이스 구현 - 파라미터 : string, 리턴 : string
		//String 클래스의 toLowerCase 메소드 이용 -> 파라미터를 소문자로 변환하여 리턴
		Function<String, String> func = String::toLowerCase;
		//리스트 -> 스트림 객체 생성 --> map() 사용하여 매핑 => collect() 이용하여 결과 생성 (ArrayList)
		List<String> lowercase = listOfNames.stream()
				.map(func)
				.collect(Collectors.toCollection(ArrayList::new));
		
		//결과 리스트 출력
		System.out.println(lowercase);
	}
}
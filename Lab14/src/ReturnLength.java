import java.util.function.Function;

public class ReturnLength {

	public static void main(String[] args) {
		//Function 인터페이스 구현 - 파라미터 : string, 리턴 : int
		//람다식 => 파라미터로 받은 문자열 길이 리턴
		Function <String, Integer> func = x -> x.length();
		//또는 {return x.length();}
		
		//결과 출력 (예시 : "Hello")
		System.out.println(func.apply("Hello"));
	}

}

import java.util.function.BiFunction;


public class ReturnSum {

	public static void main(String[] args) {
		//BiFunction 인터페이스 구현 - 파라미터 : int, int, 리턴 : int
		BiFunction<Integer, Integer, Integer> bifunc = (a,b) -> a+b;
		//람다식 => 파라미터로 받은 정수들의 합 리턴
		int result = bifunc.apply(10, 20);
		//결과 출력 (예시 : 10, 20 -> 30)
		System.out.println(result);
	}

}
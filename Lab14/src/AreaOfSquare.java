import java.util.function.Function;

//Square 인터페이스
interface Square{  
	public int getArea(int side);  
}

public class AreaOfSquare{  
	
	public static void main(String[] args) {
		//람다식 => 파라미터 : 한 변의 길이 -> 정사각형 면적 리턴
		Function <Integer, Integer> func = x -> x*x;
		//결과 출력 (예시: 한 변의 길이 = 10)
		System.out.println("정사각형 면적 : " + func.apply(10));
	}
}
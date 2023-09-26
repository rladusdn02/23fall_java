package exercise;

class ArrayUtil
{
	public static int [] concat( , ) // 배열 num1와 num2를 연결한 새로운 배열 리턴
	{
		// 배열 num1과 num2를 합한 크기의 배열 생성
		int i_temp [];

		// 배열 num1를 numtemp1로 복사 - for문 사용
	
		// 배열 num2를 numtemp2로 복사 - for문 사용
	
			// index에 주의 - num1 다음에 붙이는 것이므로
			
	}
	
	public static void print(int[] a) 
	{ 
		// 파라미터로 받아온 배열 출력 - for문 사용
	}
}


public class StaticEx 
{
	public static void main(String[] args) 
	{
		int [] array1 = { 1, 5, 7, 9 };
		int [] array2 = { 3, 6, -1, 100, 77 };
		//ArrayUtil 클래스의 concat 메소드 사용
		int [] array3 = ArrayUtil.concat(array1, array2);

		//ArrayUtil 클래스의 print 메소드 사용하여 array3 출력
	}
}

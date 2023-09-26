package exercise;

public class TV {
	// 제조사, 제조년도, 사이즈 변수 선언

	public TV(/*제조사, 제조년도, 사이즈*/)
	{
		//파라미터 값을 변수에 할당
	}
	
	public void show()
	{
		// "제조사" 에서 만든 "제조년도"년형 "인치" TV
	}

	public static void main(String[] args) 
	{
		TV myTV = new TV("LG", 2023, 72);
		myTV.show();
		System.out.println(""); // 본인 학번 이름
	}
	
}

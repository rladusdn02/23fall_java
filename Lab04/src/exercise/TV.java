package exercise;

public class TV {
	// 제조사, 제조년도, 사이즈 변수 선언
	private String product;
	private int year, size;
	

	public TV(String product, int year, int size)/*제조사, 제조년도, 사이즈*/
	{
		//파라미터 값을 변수에 할당
		this.product = product;
		this.year=year;
		this.size=size;
	}
	
	public void show()
	{
		// "제조사" 에서 만든 "제조년도"년형 "인치" TV
		System.out.println(product + "에서 만든" + year + "년형" + size + "TV");
	}

	public static void main(String[] args) 
	{
		TV myTV = new TV("LG", 2023, 32);
		TV myTV2 = new TV("Samsung", 2022, 40);
		myTV.show();
		System.out.println("2211366 김연우"); // 본인 학번 이름
	}
	
}

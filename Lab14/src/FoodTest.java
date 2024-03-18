
//음식 타입

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

enum Type {
	MEAT, FISH, OTHER
}

//Food 클래스
class Food {
	String name; //음식 이름
	boolean Vege; //채식 여부
	int calories; //칼로리
	Type type; //음식 타입

	//Food 생성자 초기화
	public Food(String name, boolean vegetarian, int calories, Type type) {
		this.name = name;
		this.Vege = vegetarian;
		this.calories = calories;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public boolean isVege() {
		return Vege;
	}

	public void setVege(boolean vege) {
		Vege = vege;
	}

	public int getCalories() {
		return calories;
	}

	public Type getType() {
		return type;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class FoodTest {

	public static void main(String[] args) {
		
		List<Food> menu = Arrays.asList(
				new Food("salad", true, 200, Type.OTHER),
				new Food("beef", false, 7100, Type.MEAT), 
				new Food("chicken", false, 1400, Type.MEAT),
				new Food("rice", true, 3510, Type.OTHER), 
				new Food("tofu", true, 75, Type.OTHER),
				new Food("season fruit", true, 120, Type.OTHER),
				new Food("pizza", true, 5150, Type.OTHER), 
				new Food("salmon", false, 4150, Type.FISH),
				new Food("sandwich", true, 500, Type.OTHER)
				);

		//리스트 -> 스트림 객체 생성 
		//--> 칼로리 300 이하인 음식만 필터링(filter() **람다식 사용)
		//--> 채식인 음식만 필터링(filter() **람다식 사용)
		//=> collect() 이용하여 결과 생성
		
		List<Food> result = menu.stream() //1. 스트림 생
				.filter(p -> p.calories <= 300) //2. 처리 단계
				.filter(p -> p.Vege == true)
				.collect(Collectors.toList()); //3. 결과 생성
		
		//결과 출력
		System.out.println(result);
	}

}

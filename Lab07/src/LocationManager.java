import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Location {
	// 위도, 경도 저장할 변수 선언
	private double lat, lng; //위도, 경도
	// Location 생성자를 이용하여 위도 경도 값 설정해주기 (도시는 하지 않아도 됨.)
	public Location(double lat, double lng) {
		this.lat=lat;
		this.lng=lng;}
	// 위도 경도 getter 함수 각각 정의하기
	public double get_lat() {
		return lat;}
	public double get_lng() {
		return lng;}
}

public class LocationManager {
	// Scanner 객체 생성
	Scanner scan = new Scanner(System.in);
	// HashMap 변수 선언 : City 는 키, Location 은 Value 값
	HashMap<String, Location> map = new HashMap<String, Location>();
	public void read() {
		// 출력문 "도시, 위도, 경도를 입력하세요."
		System.out.println("도시, 위도, 경도를 입력하세요.");
		for (int i = 0; i < 4; i++) {
			// 출력 ">> "
			System.out.print(">>");
			// 하나의 스트링으로 도시, 위도, 경도 입력받기 (입력 형식 : 도시, lat, lng)
			String text = scan.nextLine();
			// StringTokenizer 로 , 단위로 구분하기
			StringTokenizer stl = new StringTokenizer(text,",");
			// city 값 받아오기 nextToken() 이용 (공백이 있을 시 trim() 사용 - 앞뒤 공백 제거해줌)
			String city = stl.nextToken().trim();
			// lat, lng 값 받아오기 nextToken() 이용 (공백이 있을 시 trim() 사용)
			//--> string 이므로 Double.parseDouble() 함수 이용
			double lat = Double.parseDouble(stl.nextToken().trim());
			double lng = Double.parseDouble(stl.nextToken().trim());
			// 생성자를 사용해 Location 객체 하나 생성
			Location Loc = new Location(lat, lng);
			// HashMap 객체에 city, Location 추가
			map.put(city, Loc);}
		// 출력 "------------------------------"
		System.out.println("------------------------------");}

	public void printAll() {
		// Set 이용하여 HashMap 의 키 값 받아옴
		Set<String> set = map.keySet();
		// 받아온 set(키 값)을 차례로 이동할 Iterator 생성
		Iterator<String> it = set.iterator();
		// next iterator 이 있는 동안 while문 반복
		while(it.hasNext())//hasNext() 이용
		{
			// iterator 에서 값 하나 받아옴 ( == 키 값)
			String city=it.next();
			// 받아온 값을 이용하여 HashMap 에서 Value 값 받아오기 --> Location type
			Location loc=map.get(city);
			// 출력 도시 \t lat \t lng
			System.out.println(city + "\t"+loc.get_lat()+"\t"+loc.get_lng());
		}
		// 출력 "------------------------------"
		System.out.println("------------------------------");}

	public void search() {
		while (true) {
			// 출력문 "도시 이름 >> "
			System.out.print("도시 이름 >> ");
			// 검색할 도시 이름 받아오기
			String st = scan.next();
			// 검색할 도시 이름 == "그만" ? -> break;
			if (st.equals("그만")) {
				break;
			}
			// HashMap 에서 해당 도시 이름의 Value 값을 가져오기
			Location loc = map.get(st);
			// 받아온 Value 값 == null ? --> 해당 도시가 없다라고 출력
			if(loc==null) {
				System.out.println("해당 도시는 존재하지 않습니다.");}
			// 이외의 경우 도시 \t lat \t lng 출력
			else {
			System.out.println(st + "\t"+loc.get_lat()+"\t"+loc.get_lng());}}
		// Scanner 객체 닫기
		scan.close();}

	public void start() {
		read();
		printAll();
		search();}

	public static void main(String[] args) {
		LocationManager lm = new LocationManager();
		lm.start();
		System.out.println("김연우 2211366");}
}

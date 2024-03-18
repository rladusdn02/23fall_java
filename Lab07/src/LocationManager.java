import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Location {
	// ����, �浵 ������ ���� ����
	private double lat, lng; //����, �浵
	// Location �����ڸ� �̿��Ͽ� ���� �浵 �� �������ֱ� (���ô� ���� �ʾƵ� ��.)
	public Location(double lat, double lng) {
		this.lat=lat;
		this.lng=lng;}
	// ���� �浵 getter �Լ� ���� �����ϱ�
	public double get_lat() {
		return lat;}
	public double get_lng() {
		return lng;}
}

public class LocationManager {
	// Scanner ��ü ����
	Scanner scan = new Scanner(System.in);
	// HashMap ���� ���� : City �� Ű, Location �� Value ��
	HashMap<String, Location> map = new HashMap<String, Location>();
	public void read() {
		// ��¹� "����, ����, �浵�� �Է��ϼ���."
		System.out.println("����, ����, �浵�� �Է��ϼ���.");
		for (int i = 0; i < 4; i++) {
			// ��� ">> "
			System.out.print(">>");
			// �ϳ��� ��Ʈ������ ����, ����, �浵 �Է¹ޱ� (�Է� ���� : ����, lat, lng)
			String text = scan.nextLine();
			// StringTokenizer �� , ������ �����ϱ�
			StringTokenizer stl = new StringTokenizer(text,",");
			// city �� �޾ƿ��� nextToken() �̿� (������ ���� �� trim() ��� - �յ� ���� ��������)
			String city = stl.nextToken().trim();
			// lat, lng �� �޾ƿ��� nextToken() �̿� (������ ���� �� trim() ���)
			//--> string �̹Ƿ� Double.parseDouble() �Լ� �̿�
			double lat = Double.parseDouble(stl.nextToken().trim());
			double lng = Double.parseDouble(stl.nextToken().trim());
			// �����ڸ� ����� Location ��ü �ϳ� ����
			Location Loc = new Location(lat, lng);
			// HashMap ��ü�� city, Location �߰�
			map.put(city, Loc);}
		// ��� "------------------------------"
		System.out.println("------------------------------");}

	public void printAll() {
		// Set �̿��Ͽ� HashMap �� Ű �� �޾ƿ�
		Set<String> set = map.keySet();
		// �޾ƿ� set(Ű ��)�� ���ʷ� �̵��� Iterator ����
		Iterator<String> it = set.iterator();
		// next iterator �� �ִ� ���� while�� �ݺ�
		while(it.hasNext())//hasNext() �̿�
		{
			// iterator ���� �� �ϳ� �޾ƿ� ( == Ű ��)
			String city=it.next();
			// �޾ƿ� ���� �̿��Ͽ� HashMap ���� Value �� �޾ƿ��� --> Location type
			Location loc=map.get(city);
			// ��� ���� \t lat \t lng
			System.out.println(city + "\t"+loc.get_lat()+"\t"+loc.get_lng());
		}
		// ��� "------------------------------"
		System.out.println("------------------------------");}

	public void search() {
		while (true) {
			// ��¹� "���� �̸� >> "
			System.out.print("���� �̸� >> ");
			// �˻��� ���� �̸� �޾ƿ���
			String st = scan.next();
			// �˻��� ���� �̸� == "�׸�" ? -> break;
			if (st.equals("�׸�")) {
				break;
			}
			// HashMap ���� �ش� ���� �̸��� Value ���� ��������
			Location loc = map.get(st);
			// �޾ƿ� Value �� == null ? --> �ش� ���ð� ���ٶ�� ���
			if(loc==null) {
				System.out.println("�ش� ���ô� �������� �ʽ��ϴ�.");}
			// �̿��� ��� ���� \t lat \t lng ���
			else {
			System.out.println(st + "\t"+loc.get_lat()+"\t"+loc.get_lng());}}
		// Scanner ��ü �ݱ�
		scan.close();}

	public void start() {
		read();
		printAll();
		search();}

	public static void main(String[] args) {
		LocationManager lm = new LocationManager();
		lm.start();
		System.out.println("�迬�� 2211366");}
}

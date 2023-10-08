package hw;
import java.util.Scanner;
class Phone 
{
   // 이름, 전화번호 필드
   String name;
   String num;
   
   // 생성자 (파라미터 : 이름, 전화번호)
   public Phone(String name, String num) {
      this.name = name;
      this.num = num;
   }
   // get 함수 정의 (2개 : 이름, 전화번호 각각) - getName(), getTel()
   public String getName() {
      return name;
   }
   public String getTel() {
      return num;
   }
}
public class PhoneBook 
{
   // Scanner 객체 선언
   Scanner scanner = new Scanner(System.in);
   // Phone 배열 선언
   Phone p[];
   // input 함수
   private void input() 
   {
      // 인원수 입,출력
      System.out.print("인원수 >> ");
      int p_size = scanner.nextInt();
      // 인원수만큼의 Phone 배열 선언
      p = new Phone[p_size];
      // 인원수만큼의 이름과 전화번호 입력받기
      for (int i = 0; i < p_size; i++) {
         System.out.print("이름과 전화번호 (이름과 번호는 빈 칸 없이 입력) >> ");
         String name = scanner.next();
         String num = scanner.next();
         p[i] = new Phone(name, num);
      }
      // 저장되었습니다... 출력
      System.out.println("저장되었습니다...");
   }
   //search 함수 
   private void search(String searchName) 
   {   
      int count = 0;
      // phone 배열 길이만큼 돌면서 해당 이름이 있는지 확인 후 출력
      for (int j = 0; j < p.length; j++) {
      
      // 이름이 있으면 '이름' + "의 전화번호는 " + '전화번호' + 입니다."
         if (p[j].name.equals(searchName)) {
            System.out.println(p[j].name + "의 전화번호는 " + p[j].num + "입니다.");
            break;
         }
         else
            count++;
      // 이름이 없으면 '이름' + " 이(가) 없습니다."
      if (count == p.length)
         System.out.println(searchName + " 이(가) 없습니다.");            
      }
   }
   public void runCommand() 
   {
      input();
      while (true) 
      {
         // 검색할 이름 입력
         System.out.print("검색할 이름 >> ");
         String search = scanner.next();
         
         // 입력한 단어가 "stop" 인지 확인
         if (search.equals("그만"))
         // "그만" 인 경우 종료
        	break;       
         
         // 아닌 경우, search(searchName) 함수 실행
         else
            search(search);
      }
   }
   public static void main(String[] args) 
   {
      PhoneBook phonebook = new PhoneBook();
      phonebook.runCommand();
      System.out.println("김연우 2211366"); 
   }
}
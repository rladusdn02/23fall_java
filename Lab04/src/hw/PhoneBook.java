package hw;
import java.util.Scanner;
class Phone 
{
   // �̸�, ��ȭ��ȣ �ʵ�
   String name;
   String num;
   
   // ������ (�Ķ���� : �̸�, ��ȭ��ȣ)
   public Phone(String name, String num) {
      this.name = name;
      this.num = num;
   }
   // get �Լ� ���� (2�� : �̸�, ��ȭ��ȣ ����) - getName(), getTel()
   public String getName() {
      return name;
   }
   public String getTel() {
      return num;
   }
}
public class PhoneBook 
{
   // Scanner ��ü ����
   Scanner scanner = new Scanner(System.in);
   // Phone �迭 ����
   Phone p[];
   // input �Լ�
   private void input() 
   {
      // �ο��� ��,���
      System.out.print("�ο��� >> ");
      int p_size = scanner.nextInt();
      // �ο�����ŭ�� Phone �迭 ����
      p = new Phone[p_size];
      // �ο�����ŭ�� �̸��� ��ȭ��ȣ �Է¹ޱ�
      for (int i = 0; i < p_size; i++) {
         System.out.print("�̸��� ��ȭ��ȣ (�̸��� ��ȣ�� �� ĭ ���� �Է�) >> ");
         String name = scanner.next();
         String num = scanner.next();
         p[i] = new Phone(name, num);
      }
      // ����Ǿ����ϴ�... ���
      System.out.println("����Ǿ����ϴ�...");
   }
   //search �Լ� 
   private void search(String searchName) 
   {   
      int count = 0;
      // phone �迭 ���̸�ŭ ���鼭 �ش� �̸��� �ִ��� Ȯ�� �� ���
      for (int j = 0; j < p.length; j++) {
      
      // �̸��� ������ '�̸�' + "�� ��ȭ��ȣ�� " + '��ȭ��ȣ' + �Դϴ�."
         if (p[j].name.equals(searchName)) {
            System.out.println(p[j].name + "�� ��ȭ��ȣ�� " + p[j].num + "�Դϴ�.");
            break;
         }
         else
            count++;
      // �̸��� ������ '�̸�' + " ��(��) �����ϴ�."
      if (count == p.length)
         System.out.println(searchName + " ��(��) �����ϴ�.");            
      }
   }
   public void runCommand() 
   {
      input();
      while (true) 
      {
         // �˻��� �̸� �Է�
         System.out.print("�˻��� �̸� >> ");
         String search = scanner.next();
         
         // �Է��� �ܾ "stop" ���� Ȯ��
         if (search.equals("�׸�"))
         // "�׸�" �� ��� ����
        	break;       
         
         // �ƴ� ���, search(searchName) �Լ� ����
         else
            search(search);
      }
   }
   public static void main(String[] args) 
   {
      PhoneBook phonebook = new PhoneBook();
      phonebook.runCommand();
      System.out.println("�迬�� 2211366"); 
   }
}
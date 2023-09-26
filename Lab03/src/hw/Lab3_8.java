package hw;

import java.util.Scanner;

public class Lab3_8 {

	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner scan=new Scanner(System.in);
		// 출력 ("정수 몇개? ")
		System.out.print("정수 몇개? ");
		// size 입력받기
		int size=scan.nextInt();
		// size 크기의 배열 생성
		int int_arr[]=new int[size];
		// new 연산자를 사용하면 boolean 배열은 false로 초기화 됨
		// check 배열을 통해 같은 수가 있는지 확인
		boolean check[] = new boolean[101];
		int count = 0; // 생성된 정수의 개수를 세는 변수
        // 반복문 사용
        while (count < size) {
            // 난수 생성
            int r = (int) (Math.random() * 100);

            if (!check[r]) {
                // 이미 생성된 숫자가 아니라면
                check[r] = true; // 생성되었다고 표시
                int_arr[count] = r; // 배열에 저장
                count++;

                // 생성된 정수 출력
                System.out.print(r + "\t");

                if (count % 10 == 0) {
                    // 10번째 수일 때 줄 바꿈
                    System.out.println();
                }
            }
        }
        // Scanner 닫기
        scan.close();
    }
}

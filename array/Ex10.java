package array;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
			
		//index를 입력받아 값 구하기
		
		int[] intArray = {100, 200, 300, 400, 500};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("intArray배열의 인덱스는 0 ~ 4 까지 입니다.");
		System.out.println("인덱스를 입력하세요 : ");
		int index = scan.nextInt();
		
		System.out.printf("intArray["+ index + "]의 값: %d", intArray[index]);
		scan.close();
	}

}

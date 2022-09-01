package array;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		//값을 입력받아 인덱스 구하기
		int[] intArray = {10,20,30,40,50};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("intArray 배열의 값은 10 20 30 40 50 입니다");
		System.out.println("값을 입력하세요 : ");
		int value = scan.nextInt();
		
		//여기서부터 작성해 주세요
		//while문으로 작성해 주세요.
		
		int x = 0;
		
		while(x < 5) {
			
			if(intArray[x] == value) {
				System.out.println(value + "의 인덱스는 : " + x);
			}
		x++;
		}
		scan.close();
		
		
		
	}

}

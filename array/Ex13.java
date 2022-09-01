package array;

import java.util.Scanner;

public class Ex13 {
	
	public static void main(String[] args) {
		
		// 정수 5개를 입력받아
		// 입력받은 정수 중에서 3의 배수만 출력해보세요
		
		Scanner scan = new Scanner(System.in);
		
		int[] array = new int[5];
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(i+1 + "번째 정수 입력: ");
			array[i] = scan.nextInt();
		}
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 3 == 0) {
				System.out.print(array[i] + "  ");
			}
		}
	}

	
}

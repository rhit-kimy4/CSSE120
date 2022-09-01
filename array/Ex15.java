package array;

import java.util.Scanner;

public class Ex15 {
	
	public static void main(String[] args) {
		
		//정수 5번을 입력받아 array1 배열에 값을 넣은 후
		// 3과 나누어 떨어지는(3의배수) 정수의 갯수를
		// array2배열의 길이로 만든 후 그 값을 array2배열에 담고 출력해보기
		
		Scanner scan = new Scanner(System.in);
		
		int[] array1 = new int[5];
		int[] array2 = null;
		int count = 0;
		
		for(int i = 0; i < array1.length; i++) {
			System.out.println(i+1 + "번째 정수 : ");
			array1[i] = scan.nextInt();		
			if(array1[i] % 3 == 0) {
				count++;
			}
		}		

		array2 = new int[count];

		//-------------------------------------
		
		int x = 0; //array2의 제어변수.

		for(int i = 0; i < array1.length; i++) {
			if(array1[i] % 3 == 0) {
				array2[x] = array1[i];
				x++;
			}
		}
		
		for(int i = 0; i < array2.length; i++) {
			System.out.println("array2[" + i + "] : " + array2[i]);
		}
		
		scan.close();
		
		
	}

}

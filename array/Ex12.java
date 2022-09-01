package array;

import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		
		//배열중에 2개의 인덱스를 입력받아 값을 교환하기
		Scanner scan = new Scanner(System.in);
		
		int[] array = {1, 2, 3, 4, 5};
		
		System.out.println("교환전 array 배열");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
			
		}
		System.out.println();
		
		//교환 후
		System.out.println("첫번째 교환할 인덱스 : ");
		int x = scan.nextInt();
		
		System.out.println("두번째 교환할 인덱스 : ");
		int y = scan.nextInt();
		
		int temp = 0;
		
		temp = array[x];
		array[x] = array[y];
		array[y] = temp;
		
		
		System.out.println("교환후 array 배열");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
		
	}

}

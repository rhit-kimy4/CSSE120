package array;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
			
		//5개의 숫자를 입력받아 작은수부터 나열하세요
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];
		
		//입력받기
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(i+1 + "번째 숫자 : ");
			num[i] = scan.nextInt();
			}
		
		int temp = 0;
		
		for(int i = 0; i < num.length; i++) {
			for(int j = i; j < num.length; j++) {
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(i+1 + "번째 숫자 : " + num[i]);
		}
		
	}

}

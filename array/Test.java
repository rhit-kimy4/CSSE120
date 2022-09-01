package array;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
			
		//배열과 for문을 이용해서 3명의 이름과 영어점수를 입력받고 출력까지하기
		
		
		String[] name = new String[3];
		
		int[] score = new int[3];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<name.length; i++) {
			System.out.print(i+1 + "번째 이름: ");
			name[i] = scan.next();
			
			System.out.print(i+1 + "번째 학생 성적 : ");
			score[i] = scan.nextInt();
			
		}
		
		
		for(int i = 0; i < 3; i++) {
			
			System.out.print(i+1 + "번째 학생 이름 : " + name[i] + "\t");
			System.out.print("성적 : " + score[i] + "\n");
			
		}
		scan.close();
		
	}

}

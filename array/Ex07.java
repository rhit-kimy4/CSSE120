package array;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		
		//학생 3명의 이름, 국어, 영어 성적을 입력받고
		//총점과 순위를 나타내보자
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] total = new int[3];
		int[] rank = new int[3];
		
		// 데이터 입력받기
		
		for(int i = 0; i < name.length; i++) {
			System.out.println(i+1 + "번째 학생의 이름 : ");
			name[i] = scan.next();
			System.out.println(i+1 + "번째 학생의 국어점수 : ");
			kor[i] = scan.nextInt();
			System.out.println(i+1 + "번째 학생의 영어점수 : ");
			eng[i] = scan.nextInt();
			
			total[i] = kor[i] + eng[i];
			
		//순위구하기 : 우선 1등으로 초기화를 하고,
		//다른 학생 성적과 내 성적의 총점을 비교해서
		//작으면 순위를 하나 올려준다
			
		}
		
		for(int i = 0; i < 3; i++) {
			rank[i] = 1;
			for(int j = 0; j < 3; j++) {
				if(total[i] < total[j]) {
					rank[i]++;
				}
			}
		}// 바깥쪽 for문
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("%s님의 총점은 %d점이고, 순위는 %d등입니다\n", name[i], total[i], rank[i]);
		}

		
	}

}

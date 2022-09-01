package array;

public class Ex16 {
	
	public static void main(String[] args) {
		
		//배열 복사에 대해 알아보자
		
		//int[] engScores = {70, 65, 80, 90, 85};
		// 이렇게만 적으면 선언과 동시에 값을 넣는 것
		// 자바 컴파일러가 알아서 컴파일 해주는것임.
		
		
		int[] engScores = new int[] {70, 65, 80, 90, 85};
		//원래는 new int[] 붙여주는게 원칙
		
		//학생 5명의 영어점수를 향상된 for문으로 출력해보자.
		
		for(int score : engScores) {
			System.out.println(score);
		}
		
		//만약에 학생이 2명이 더 늘어났다면...
		int[] newEngScores = new int[7];
		
		for(int i = 0; i < engScores.length; i++) {
			newEngScores[i] = engScores[i];
			
		}
		
		for(int s : newEngScores) {
			System.out.print(s + "  ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

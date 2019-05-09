package test;

public class classMaker {

	public static void main(String[] args) {
		String[] Subjects = { " 이름  ", "java ","Oracle","HTML", "JQuery", "JSP ", "총점","평균","석차" };
		String[] Student = { "강현욱", "김난경", "신유수", "김도현", "김주은", "김지연", "김현기",
				"김현지", "노대현", "박경훈", "박선희", "박정권", "박지선", "윤상호", "윤한수", "이대용",
				"이준호", "이한화", "임재우", "장구현", "진민규", "하준용", "한상호", "황수정" };

		

		int[][] scores = new int[24][8];

		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length - 3; j++) {
				scores[i][j] = (int) (Math.random() * 50) + 50;
				scores[i][5] += scores[i][j];
			}
			scores[i][6] = scores[i][5] / 5;
		}

		for (int i = 0; i < scores.length; i++) {
			scores[i][7] = 1;
			for (int j = 0; j < scores.length; j++) {
				if (scores[i][5] < scores[j][5]) {
					scores[i][7]++;
				}
			}
		}
		// 출력 한번에 하기
		for (int i = 0; i < Subjects.length; i++) {
			System.out.print(Subjects[i] + "\t");
		}
		System.out.println();
		
		for(int i = 0; i < scores.length; i++){
			System.out.print(Student[i] + "\t");
			for(int j = 0; j < scores[0].length; j++){
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}
		/*
		 * int average[] = new int[24]; for(int i = 0; i < average.length; i++){
		 * average[i] += total[i] / 5 ; }
		 * 
		 * int Rank[] = new int[24]; for(int i = 0; i < Rank.length; i++){
		 * Rank[i] = 1; } for (int i = 0; i < total.length; i++) { for (int j =
		 * 0; j < total.length; j++) { if (total[i] < total[j]) { Rank[i]++; } }
		 */
	}
}

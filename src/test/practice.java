package test;

import java.util.Arrays;

public class practice {

	public static void main(String[] args) {
	
		String [] Subjects = {"이름","java", "Oracle", "HTML", "JQuery", "JSP"};
		
		String [] Students = { "강현욱", "김난경","신유수","김도현","김주은","김지연","김현기","김현지","노대현","박경훈","박선희","박정권",
							"박지선", "윤상호", "윤한수","이대용","이준호","이한화","임재우","장구현","진민규","하준용","한상호","황수정"};
	
		
		int[][] score = new int[Students.length][Subjects.length];
		for (int i = 0; i < Subjects.length; i++) {
			System.out.print(Subjects[i] + "\t");
		}
		System.out.println();

		for (int i = 0; i < Students.length; i++) {

			System.out.println(Students[i] + "\t");
		}
		System.out.println();

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				score[i][j] = (int) (Math.random() * 51)+ 50;
			}
		}
		
	
		for (int i = 0; i < Subjects.length; i++) {

		}
		// 정렬
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = 0; j < score.length - 1 - i; j++) {
				if (score[j][score.length] > score[j + 1][score.length]) {
					int[] temp = score[j];		//점수정렬
					score[j] = score[j + 1];
					score[j + 1] = temp;
					
//					String[] temp1 = Students[j];		//이름정렬
//					Students[j] = Students[j + 1];
//					Students[j + 1] = temp;
			}
			}
		}

	}

}
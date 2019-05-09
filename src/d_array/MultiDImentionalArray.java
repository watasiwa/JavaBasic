package d_array;

import java.util.Arrays;

@SuppressWarnings("unused")
public class MultiDImentionalArray {

	public static void main(String[] args) {
		/*
		 * 1. 다차원 배열
		 * - 배열안에 배열을 가지고 있는 형태이다.
		 * - 2차원 배열은 테이블 형태이다.
		 * - 여러개의 공간 안에 배열이 있다.
		 */
	/*		
		int[][] numbers = new int[2][3];
		int numbers2[][] = new int [][]{{1,2,3}, {4,5,6,}};   //2개의 공간안에 3개씩 들어있다? ㅅㅂ
		int[] numbers3[] = { {1,2,3,}
							      ,{4,5,6,}
							      ,{7,8,9,}};
		
		int[][] numbers4 = new int[3][];     //가변길이 설정방법
		numbers4[0] = new int[3];			 // [],[],[]	
		numbers4[1] = new int[4];			 // [],[],[],[]
		numbers4[2] = new int[10];			 // [],[],[],[],[],[],[],[],[],[]
		
		numbers[0][0] = 0;
		numbers[0][1] = 1;
		numbers[0][2] = 2;
		numbers[1][0] = 10;
		numbers[1][1] = 11;
		numbers[1][2] = 12;
		
		System.out.println(numbers.length);   //1차원 배열의 길이
		System.out.println(numbers[0].length); //두번째열구하는거  [][?]  ?된곳배열을 구할때

		for(int i = 0; i <numbers.length; i++){
			for(int j = 0; j <numbers[i].length; j++){
				System.out.println(numbers[i][j]);
			}
		}
		
		System.out.println(Arrays.toString(numbers));
		
		for(int i = 0; i < numbers.length; i++){
			System.out.println(Arrays.toString(numbers));
		}
		
		for(int[] numbersArr : numbers){
			for(int number : numbersArr){
				System.out.println(number);
			}
		}
	*/			//문제 1. 우리반 모두의 java, Oracle, HTML, JQuery JSP 성적을
		//50~ 100까지 랜덤으로 생성시키고,
		//1-1) 이름, 성적,총점,평균,석차를 출력해주세요.
		scoreRank();
		//1-2) 석차순으로 석차, 이름 ,성적, 총점, 평균을 출력해주세요.
		//scoreSort();
		
			
	}
	
	private static void scoreRank() {

		String [] Subjects = {"이름" , "java" , "Oracle" , "HTML" , " JQuery" , " JSP "};
		String [] Student = { "강현욱", "김난경","신유수","김도현","김주은","김지연","김현기","김현지","노대현","박경훈","박선희","박정권",
							"박지선", "윤상호", "윤한수","이대용","이준호","이한화","임재우","장구현","진민규","하준용","한상호","황수정"};

			
		for(int i = 0; i < Subjects.length; i++){
			System.out.print(Subjects[i] + " \t");
		}
		for(int i = 0; i < Student.length; i++){
			System.out.println(Student[i] + "\t");
		}
					
		int [][] scores = new int [25][8];
		
		for(int i = 0 ; i < scores.length; i++){
			for(int j = 0 ; j < scores.length-3; j++){
				scores[i][j] = (int)(Math.random() * 50) +50;
				System.out.println(scores.length);
			}
	     }		
		/*
		int total[] = new int[25];
			for( int i = 0; i < total.length; i++){
				for(int j = 0; j < total.length; j++){
					total[i] += scores[i][j];
				}
			}
		
		int average[] = new int[25];
			for(int i = 0; i < average.length; i++){
				average[i] += total[i] / Subjects.length; 
			}
	
		int Rank[] = new int[25];
			for(int i = 0; i < Rank.length; i++){
				Rank[i] = 1;
			}
				for (int i = 0; i < total.length; i++) {
					for (int j = 0; j < total.length; j++) {
						if (total[i] < total[j]) {
							Rank[i]++;
			}
			
*/			
			
				
				
			
			
			
}

}
	



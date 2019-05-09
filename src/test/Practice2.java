package test;

public class Practice2 {

	public static void main(String[] args) {

		
		String[] friend = {"한상호","장구현","이재찬","김윤규","이상봉"};
	
		for(int i = 0; i < friend.length; i++){
		
		String friends = friend[i];
		System.out.println(friends + "이(가) 도착했습니다.");
		}

		String [] Subjects = {"이름","java", "Oracle", "HTML", "JQuery", "JSP"};
		String [] Students = { "강현욱", "김난경","신유수","김도현","김주은","김지연","김현기","김현지","노대현","박경훈","박선희","박정권",
							"박지선", "윤상호", "윤한수","이대용","이준호","이한화","임재우","장구현","진민규","하준용","한상호","황수정"};

		
		
		
		
		
		
		
		int[] score[] = new int[25][8];
		
		for(int i = 0; i < score.length; i++){
			for(int j = 0; j < score[i].length-3; j++){
				score[i][j] = (int)(Math.random()* 50 + 50) ;
				System.out.println(score.length);
			}
		}
		
		
		
	}
}

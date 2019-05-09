package i_collection;

import java.util.ArrayList;
;

public class CollectionFramework {

	public static void main(String[] args) {
		
		/*	필수
		 * 
		 * 1. CollectionsFramework
		 *  - Collections		: 다수의 데이터
		 *  - Framework		: 표준화된 프로그래밍 방식
		 *  
		 * 2. List
		 *  - Vector		: ArrayList의 구버전
		 *  - ArrayList	: 저장순서 유지, 중복허용          *필수* , 중복허용 - 인덱스값이 중복되어도 된다.
		 *  - LinkedList	: 데이터 추가 및 삭제시간 단축	 - 단, 읽는 시간이 오래걸림	 	  	
		 *  - Stack		: LIFO(Last In First Out)			1234 순으로 들어오면 4321 순으로 나감
		 *  - Queue 		: FIFO(First In First Out)			1234 순으로 들어오면 1234 순으로 나감
		 * 
		 * 3. Set
		 * - HashSet		: 중복허용 안함, 저장순서 유지안함.   
		 * - TreeSet		: 정렬, 검색, 기능 향상
		 * 
		 * 4.Map
		 * - HashTable	: HashMap의 구버전
		 * - HashMap	: 키(Key)와 값(value)을 한쌍으로 저장      *필수*  -- 키에 해당하는 값을 가져옴
		 * - TreeMap	: 정렬, 검색 기능 향상
		 * 
		 2.3.4 는 인터페이스다.
		 */
		
		//숙제 우리반 모두의 Java. Oracle, HTML, JQuery, JSP 성적을
		//50~100까지 랜덤으로 생성시키고
		// 석차순으로 석차,이름,과목별 점수, 총점, 평균을 출력해주세요.
/*
	ArrayList<ArrayList<Object>> our = new ArrayList<ArrayList<Object>>();
	
	
	
	our.add(new ArrayList<Object>()); //0번 인덱스에 저장.. 뭘?
	our.add(new ArrayList<Object>());
	our.add(new ArrayList<Object>());
	our.add(new ArrayList<Object>());
	our.add(new ArrayList<Object>());
	our.add(new ArrayList<Object>());
	our.add(new ArrayList<Object>());
	our.add(new ArrayList<Object>());
	our.add(new ArrayList<Object>());
	our.add(new ArrayList<Object>());
	our.add(new ArrayList<Object>());
	our.add(new ArrayList<Object>());
	our.add(new ArrayList<Object>());
	our.add(new ArrayList<Object>());
	our.add(new ArrayList<Object>());
	our.add(new ArrayList<Object>());
	our.add(new ArrayList<Object>());
	our.add(new ArrayList<Object>());
	our.add(new ArrayList<Object>());
	our.add(new ArrayList<Object>());
	our.add(new ArrayList<Object>());
	our.add(new ArrayList<Object>());
	our.add(new ArrayList<Object>());
	our.add(new ArrayList<Object>());
	
	our.get(0).add("강현욱");
	our.get(1).add("김난경");
	our.get(2).add("신유수");
	our.get(3).add("김도현");
	our.get(4).add("김주은");
	our.get(5).add("김지연");
	our.get(6).add("김현기");
	our.get(7).add("김현지");
	our.get(8).add("노대현");
	our.get(9).add("박경훈");
	our.get(10).add("박선희");
	our.get(11).add("박정권");
	our.get(12).add("박지선");
	our.get(13).add("윤상호");
	our.get(14).add("윤한수");
	our.get(15).add("이대용");
	our.get(16).add("이준호");
	our.get(17).add("이한화");
	our.get(18).add("임재우");
	our.get(19).add("장구현");
	our.get(20).add("진민규");
	our.get(21).add("하준용");
	our.get(22).add("한상호");
	our.get(23).add("황수정");
	
	
	System.out.print("이름" + "\t" +"Java" + "\t" +"Oracle" + "\t" +"HTML" +"\t" + "JQuery" + "\t" +"JSP"+ "\t" +"총점"+"\t" +"평균"+"\t" +"석차");
	System.out.println();
	
	int sum = 0;

		for (int i = 0; i < our.size(); i++) {
			for (int j = 0; j < 5; j++) {
				our.get(i).add((int) ((Math.random() * 51) + 50));
				sum += (int)(our.get(i).get(j));
			}
			
			our.get(i).add(sum);
			our.get(i).add(sum/5);
			our.get(i).add(1);
			sum =0;
		}		
		
		for(int i =0; i < our.size(); i++){
			for(int j = 0; j < our.size(); j++){
				if((int)our.get(i).get(5) < (int) our.get(j).get(5)){
					our.get(i).set(7, (int)our.get(i).get(7)+1);
				}
			}
		}
		
		for(int i =0; i <our.size() -1; i++){
			for(int j = i +1; j < our.size(); j++){
				if((int)(our.get(i).get(6)) < (int)(our.get(j).get(6))){
					ArrayList<Object> temp = our.get(i);
						our.set(i, our.get(j));
						our.set(j, temp);
				}
			}
		}
		
		for(int i = 0; i < our.size(); i++){
			for(int j = 0; j < our.get(0).size(); i++){
				if(j ==0){
					System.out.println(our.get(i).get(7)+ "\t");
				}else{
					System.out.println(our.get(i).get(j-1)+ "\t");
				}
			//	System.out.println(our.get(i).get(j));
				
			}
		}
	
	
	*/
	scoreSort();
	
		
	
	
	
	}

	private static void scoreSort() {
		//학생이름
		ArrayList<String> students = new ArrayList<String>();
		//과목
		ArrayList<String> subject = new ArrayList<String>();
		//과목별 점수
		 ArrayList<ArrayList<Integer>> scores = new ArrayList<ArrayList<Integer>>();
		 
	students.add("강현욱");
	students.add("김난경");
	students.add("신유수");
	students.add("김도현");
	students.add("김주은");
	students.add("김지연");
	students.add("김현기");
	students.add("김현지");
	students.add("노대현");
	students.add("박경훈");
	students.add("박선희");
		 
	subject.add("Java");
	subject.add("Oracle");
	subject.add("HTML");
	subject.add("JQuery");
	subject.add("JSP");
	
	
	//점수 입력
	
	for(int i = 0; i < students.size(); i++){
		ArrayList<Integer> score = new ArrayList<Integer>();
		
		score.add(1);
		
		for(int j =0; j < subject.size(); j++){
			score.add(getRandom(50,100));
		}
		
		scores.add(score);
	}
	
	//총점과 평균을 구한다
	for(int i =0; i < scores.size(); i++){
		ArrayList<Integer> score = scores.get(i);
		
		int total = 0; //총점 초기화
		
		for(int j = 1; j < score.size(); j++){
			total += score.get(j);
		}
		
		score.add(total);		//총점
		score.add(total / subject.size());		//평균
	}
	
	//석차를 구한다.
	for(int i =0; i < scores.size(); i++){
		for(int j =0; j < scores.size(); j++){
			if (scores.get(i).get(subject.size()+1)	< scores.get(j).get(subject.size()+1)){
				
				scores.get(i).set(0, scores.get(i).get(0) +1);
			}
				
			
				
			}
		}
	
	
	//석차순으로 비교한다.
	for(int i = 0; i < scores.size() -1; i++){
		boolean changed = false;
		
		for(int j = 0; j < scores.size() -1 -i; j++){
			if(scores.get(j).get(0) > scores.get(j+1).get(0)){
				ArrayList<Integer> temp = scores.get(j);
				scores.set(j, scores.get(j+1));
				scores.set(j+1, temp);
				
				String tempName = students.get(j);
				students.set(j, students.get(j+1));
				students.set(j+1, tempName);
				
				changed = true;
			}
		}
	
		}
	//출력한다.
	System.out.print("석차\t이름");
	for(int i = 0; i < subject.size(); i++){
			System.out.print("\t" + subject.get(i));
	}System.out.println();
	for(int i =0; i < scores.size(); i++){
		ArrayList<Integer> score = scores.get(i);
		for(int j =0; j < score.size(); j++){
			System.out.print(score.get(j) + "\t");
		
			if(j == 0){
				System.out.print(students.get(i)+ "\t");
			}
		} System.out.println();
	}
	}
	private static Integer getRandom(int from, int to) {
		return (int)(Math.random() * (Math.abs(to-from)+1))
				+ Math.min(from, to);
	}


}

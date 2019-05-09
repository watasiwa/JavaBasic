package h_lang;

public class MathMethod {

	public static void main(String[] args) {
		/*
		 * round()	: 반올림
		 * ceil()		: 올림
		 * floor()		: 내림
		 * abs()		: 절대값
		 * random()	: double 난수 발생(0.0~1.0미만) 
		 */
		
		
		double d1 = 0.5;
		double d2 = -0.5;
		
		//반올림
		System.out.println(Math.round(d1));
		System.out.println(Math.round(d2));
		
		//올림
		System.out.println(Math.ceil(d1));
		System.out.println(Math.ceil(d2));
		
		//내림
		System.out.println(Math.floor(d1));
		System.out.println(Math.floor(d2));

		//절대값
		System.out.println(Math.abs(d1));
		System.out.println(Math.abs(d2));
		
		//랜덤
		for(int i = 0; i <30; i++){
			int random = (int)(Math.random() * 10)+1;
			System.out.print(random + " ");
		}
		System.out.println();
		
		
		// 5~10의 숫자만 나오게 하는 로직
		
		for(int i =0; i <30; i++){
			int random = getRandom(10,15);
			System.out.print(random + " ");	
		}
	}

	private static int getRandom(int from, int to) {
		
		return (int)(Math.random() * (Math.abs(to - from) +1))
						+ Math.min(from, to);
	}

	
	
}

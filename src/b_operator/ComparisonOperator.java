package b_operator;

public class ComparisonOperator {

	public static void main(String[] args) {
		/*
		 * 1. 비교연산자
		 *  - <(작다), >(크다), <=(작거나 같다), >=(크거나 같다), ==(같다), !=(같지 않다)
		 *  - 두개의 값을 비교하는 연산자이다.
		 *  - 비교결과가 참이면 true, 거짓이면 false를 반환한다.
		 *  - 대소비교는 숫자 값 비교에 사용 가능하다.
		 *  - 등가비교는 모든 자료형에 사용 가능하다.
		 *  
		 */
		
		boolean b = 1 < 2;
		System.out.println(b);			//true
		b = 1 > 2;
		System.out.println(b);			// false
		b = 1 <= 1;
		System.out.println(b);			//true
		b = 1 >= 1;
		System.out.println(b);			//true
		
		b = 1 == 1.0f;   // 1은 int  1.0f 는 float 라서 큰 표현이 가능한 float으로 형변환이 일어난다/
		System.out.println(b);
		b = 0.1 == 0.1f;     //0.1은 double 0.1f 는 float 은 7자리의 정확도  double은 15자리의 정확도를 가지고있어서 정확도가 서로달라서 
		System.out.println(b);
		System.out.printf("%22.20f%n", 0.55555555555555555f);
		System.out.printf("%22.20f%n", 0.555555555555555555);
		
		b = 0.1f == (float)0.1;   // double에 형변환을 넣어으면 값이 float과 같게나옴
		
		b = "abcd" == "abcd";  // 
		System.out.println(b);
		String str = new String("abcd");
		str = "abcd";
		b = "abcd" == new String("abcd");   // 참조형 변수는 변수에 주소를 저장하고, 값이 저장된 주소를 불러온다.
		System.out.println(b);
		
		b = "abcd".equals(new String("abcd"));  //문자열을 비교할때는 비교연산자 ==이 아니라 equals를 사용한다.
		System.out.println(b);
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

}

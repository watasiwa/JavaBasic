package a_variable;

public class variable {

	public static void main(String[] args) {
        // 이것은 한줄주석 입니다.
		/* 는 여러개주석 작성
		 * 가능
		 * 합
		 * 니	
		 * 다	
		 * 
		 *
		/*
		 * 1. 변수
		 * - 단 하나의 값을 저장할 수 있는 메모리 공간
		 * - '타입 변수명'으로 선언
		 * 
		 * 2. 변수의 타입(값의 종류)
		 * - 논리형(boolean)
 		 * - 문자형(char)
 		 * - 정수형(byte, short, int, long)
 		 * - 실수형(float, double)
 		 * 
 		 * 3. 명명규칙
 		 * - 영문자 대소문자, 한글, 숫자, 특수문자('_','$')를 사용할 수 있다.
 		 * - 대소문자가 구분되며 길이에 제한이 없다.
 		 * - 숫자로 시작할 수 없다.
 		 * - 예약어는 사용할 수 없다.(예약어는 책 25쪽 참조)
 		 * -8 [기본적으로 변수는 소문자를 사용하고, 상수는 대문자를 사용한다.]
 		 * - [여러 단어로 이루어진 경우 단어의 첫 글자를 대문자로 한다.]
 		 * - [클래스명의 첫 글자는 대문자로 한다.]
 		 * 
 		 * 4. 타입의 크기
 		 * - boolean     (1 byte) : false, true
 		 * - char        (2 byte) : '\u0000' ~ '\uffff'(0 ~ 65335)
 		 * - byte        (1 byte) : -128 ~ 127(-2^7 ~ 2^7 -1)
 		 * - short       (2 byte) : -32768 ~ 32767(-2^15 ~ 2^15 -1)
 		 * - int         (4 byte) : -2147483648 ~ 2147483647(-2^31 ~ 2^31 -1, 약 -20억 ~ 20억)
 		 * - long        (8 byte) : -9223372036854775808 ~ 923372036854775807 (-2^63 ~ 2^63 -1, 약-900경 ~ 900경
 		 * 8- float       (4 byte) : 1.4 * 10^-45 ~ 3.4 * 10^38(양의 범위)
 		 * - double      (8 byte) : 4.9 * 10^-324 ~ 1.8 * 10^308 (양의 범위)
 		 * 
 		 * 
 		 *8 5. 형변환
 		 * - 데이터의 타입을 다른 타입으로 변환하는 것
 		 * - 형변하고자 하는 테이터 앞에 변환하고자하는 타입을 괄호와 함께 붙여준다.
 		 * - 형변하고자 하는 데이터의 표현범위보다 크기가 큰 표현범위로의 변환은 생략이 가능하다.
 		 8* 
 		 *  6. 참조형 변수
 		 *  - 메모리에 올라간 클래스의 주소를 저장할 수 있다.
 		 *  - 8개의 기본형 외의 모든 타입이 참조형이다.
 		 *  - 기본값은 null
 		 *  
 		 *  7. 상수와 리터럴
 		 *  - 상수 : 값을 한번 저장하면 변경할 수 없는 저장공간
 	8	 *  - 리터럴 : 그 자체로 값을 의미하는것
 		 * 
 		 * 
 		 * 
		 */
	
		boolean bool;  
		
		bool = false;
		bool = true;
		
		byte b = 0;
		short sh = 0;
		int i = 0;
		long l = 10000000000000L;
		
		
		float f = 0.0f;   // 빨강색으로 나오면 에러   숫자뒤에 f를 삽입하여 float 라는 것을 인식시킴  *플롯쓸때는 무조건 f를 넣어야한다;
		double d = 0.0;
		
		char ch = 'A';         //캐릭터에는 문자하나만 들어간다
		System.out.println(ch);
		ch = 65;
		System.out.println(ch);
		ch = '\u0041';
		System.out.println(ch);
		
		String str = "ABCD";    //string 클래스 = 참조형 변수
		str = null;
		
		final int NUMBER = 0;    //final이 붙은 숫자는 상수- 한번 값을 넣으면 변경할수 없다
		//NUMBER = 1;
		
		final int MAX_NUMBER = 0;  // (_)를 사용하여 숫자의 길이를 정한다
		
		str = "A" + 5;
		System.out.println(str);
		
		str = "A" + 5 + 5;
		System.out.println(str);
		
		str = 5 + 5 + "A"; 
		System.out.println(str);
		
		str = true + "A";
		System.out.println(str);
		
		str = null + "A";
		System.out.println(str);
		
		str = "\"" + '\'' + "\\" + "\t탭\n줄바꿈";
		System.out.println(str);
		
		str = "B" + true;
		System.out.println(str);
		
		// 형변환방법
		int num = (int)'A';
		System.out.println(num);
		
		num = (int) 1.2;        // 소수점을 형상변화하여 정수로 바뀜
		System.out.println(num);
		
		float num2 = num;        // 실수가 되어서 소수점이 생김
		System.out.println(num2);
		
		long regNo = 900611-987231;
		System.out.println(regNo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
         
	}

}

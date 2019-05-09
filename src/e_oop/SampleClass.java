package e_oop;					//패키지의 이름은 항상 소문자

import java.util.Arrays;		//	import는 패키지와 클래스 사이에 위치해야한다.

public class SampleClass {         // 클래스 첫글자 이름은 대문자

	int field = 1;   // 필드 멤버변수 전역변수
					  // 전역변수는 메서드 안에서도 사용될 수 있다.	
	
	//기본적인 메서드
	void method1(){							//()안에는 명령 수행에 필요한 정보 즉 변수		
		Arrays.toString(new int[0]);			// 컨트롤+ 쉬프트+o를 누르면 자동으로 import 된다.
	}
	
	//명령의 수행에 필요한 정보 : 매개변수, 파라미터 ,아규먼트 로 불린다.
	void method2(int parameter){
		parameter += 2;
	}
	
	// 명령 수행 후 결과를 돌려주는것 : 반환타입, 리턴타입
	String method3(){
		return "받아라!!";							// return  @  @: 돌려줄변수
	}
	
	// 파라미터와 리턴타입이 모두 있는 메서드
	int method4(int parameter){
		parameter += field;
		return parameter;
	}
	
}

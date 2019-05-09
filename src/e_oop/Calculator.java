package e_oop;

public class Calculator {
	
	
	//더하기
	Long Plus(long up, long down){
		 System.out.println("더하기 : " + (long)(up +down));
		 return (long)(up+down);
	}
	//빼기
	Long Subtract(long up, long down){
		System.out.println("빼기 :" + (long)(up - down));
		return (long)(up - down);
	}
	//곱하기
	Long Multiply(long up, long down){
		System.out.println("곱하기 :" + (long)(up * down));
		return (long)(up * down);
	}
	
	//나누기
	Long Dvision(long up, long down){
		System.out.println("나누기 :" + (long)(up / down));
		return (long)(up / down);
	}
	
	// 나머지
	Long Remainder(long up, long down){
		System.out.println("나머지 :" + (long)(up % down));
		return (long)(up % down);
	}
}	


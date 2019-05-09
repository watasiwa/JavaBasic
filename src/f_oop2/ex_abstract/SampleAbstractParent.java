package f_oop2.ex_abstract;
// abstract가 붙으면 추상클래스
public abstract class SampleAbstractParent {
		//일반 메서드 사용법
		void method(){
			
		}
	
		//추상메서드 사용법 : 선언부만 있고 구현부는 없는 메서드.
		// 
	abstract void abstractMethod();
}

 class SampleAbstractChild extends SampleAbstractParent{

	 // 추상메서드는 반드시 구현시켜야한다.
	 // 상속받은 추상메서드를 추상메서드로 남겨두려면 클래스를 추상클래스로 변경해야 한다.
	 @Override		
	void abstractMethod() {
		
		
	}
	



}
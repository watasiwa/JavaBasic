package f_oop2;

public class SampleParent extends Object{
	
		
		
		//전역변수
		String parentVariable;
		String var;

		//생성자
		public SampleParent(String param) {
			super();
			parentVariable = param;
		}
		
		public SampleParent() {
			//생성자에서 다른 생성자를 호출할때는 this()를 사용한다.
			this("부모 변수");
		}
		//오버로딩
		void parentMethod(){
			System.out.println("부모 메서드");
		}
		
}

package f_oop2;

//싱글톤 패턴 : 인스턴스의 생성을 제한하여 하나의 인스턴스만 사용하는 디자인 패턴. 
public final class Singleton {
		
		private static Singleton instance;
				
		//생성자의 접근제어자가 private이기 때문에 다른 클래스가 상속받을 수 없다.
		private Singleton(){
			
		}
		
		
		public static Singleton getInstance(){
			if(instance == null){
				instance = new Singleton();
			}
			return instance;
}
		
		
		
}

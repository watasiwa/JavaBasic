package h_lang;

public class ObjectMethod {

	public static void main(String[] args) {
		//toString() : 객체에 대한 정보를 문자열로 제공한다.
		// Object클래스의 메서드라서 오버라이딩해서 불러올수있다.
		
		ObjectMethod om = new ObjectMethod();
		System.out.println(om);
		//클래스명@해시코드(16진수)
		System.out.println(om.toString());
	}
	@Override
	public String toString(){
		return "toString() 메서드 호출";
	}
	
	
}

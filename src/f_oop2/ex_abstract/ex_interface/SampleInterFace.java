package f_oop2.ex_abstract.ex_interface;

public interface SampleInterFace {
	
	//인터페이스의 모든 멤버변수는 [public static final]제어자를 사용해야한다.
	
	public static final int NUM1 = 1;
	
	//모든 멤버변수의 제어자가 같기 때문에 생략이 가능하다.
	int NUM2 = 2;
	
	
	//인터페이스의 모든 메서드는 public abstract 제어자를 사용해야 한다.
	public abstract void method1();
	
	//모든 메서드의 제어자가 같기 때문에 생략이 가능하다.
	void method2();
	
	//이외에 JDK1.8부터 static 메서드와 default 메서드를 사용할 수 있게 되었다.
}

// 인터페이스 상속은 implements이다. interface는 다중상속이 가능 , 중복되는 메서드는 안올라감
class SampleImplement implements SampleInterFace, SampleInterface2{

	@Override
	public void method1() {
		System.out.println(NUM1);
	}

	@Override
	public void method2() {
		System.out.println(SampleImplement.NUM2);
	}

	@Override
	public void method3() {
		
	}
	
	
}

interface SampleInterface2{
	void method1();
	void method3();
}
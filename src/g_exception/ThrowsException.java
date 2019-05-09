package g_exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsException {

	public static void main(String[] args) {
		try {
			method();
		} catch (IOException e) {
			//넘겨받은 예외를 처리한다. 
			e.printStackTrace();
		}	
			try {
				method2();
			} catch (FileNotFoundException e) {
				//예외를 넘겨받아 처리를 분담한다.
				e.printStackTrace();
			}
	}

	private static void method2() throws FileNotFoundException {
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			System.out.println("일부 예외처리");
			throw e;
		}
	}
		
	// 메서드에 예외를 선언함 -예외를 처리하지않고 메인메서드로 넘어감
	// 메서드를 실행할려면 예외를 처리해야한다. 
	//메서드에 예외를 선언하면 메인메서드로 넘어감
	// 메인메서드에서 catch를 만듦
	private static void method() throws IOException {
		throw new  IOException();
	}

}

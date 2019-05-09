package e_oop;

public class RecursiveCall {

	public static void main(String[] args) {
/*    4! = 4* 3* 2* 1;
 * 
 */
		int result = factorial(4);
		System.out.println(result);
	}

	private static int factorial(int i) {
		int result = 0;
		
		if(i == 1){
			result = 1;
		}else{
			result = i * factorial(i -1);                  //자기 메서드 안에서 자신을 호출하는것 재귀호출
		}
		
		return result;
	}
}

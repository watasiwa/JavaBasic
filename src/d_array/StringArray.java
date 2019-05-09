package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		/*
		 * 1. String의 주요 메서드
		 *  - equals() : 문자열의 내용이 같은지 확인한다.
		 *  - toCharArray() : 문자열을 문자배열로 반환한다.
		 *  - length() : 문자열의 길이를 반환한다.
		 *  - charAt() : 문자열에서 해당 인덱스에 있는 문자열을 반환한다.
		 *  - substring() : 문자열에서 해당 범위에 있는 문자열을 반환한다.
		 *  - indexOf() : 문자열 내의 특정 문자열의 인덱스를 반환한다.
		 *  - split() : 문자열을 특정 문자열을 기준으로 나누어 배열로 반환한다.
		 *  - replace() : 문자열 내의 특정 문자열을 원하는 문자열로 변경해 반환한다.
		 *  
		 */
		
		
		String str = "abcd,efg";
		
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		
		for(int i = 0; i < str.length(); i++){
			System.out.println(str.charAt(i));
		}
		
 		System.out.println(str.substring(3));     // 3번인덱스부터 짤라서 반환   d,efg
 		
 		System.out.println(str.substring(1,4));   // 1번인덱스부터 4번인덱스까지 전까지 반환
 		
 		System.out.println(str.substring(0, str.indexOf(",")));    // 0부터 ,까지 인덱스를 짤라서 반환(, 미포함)
 		
 		String[] split = str.split(",");   // ""안에 들어오는 문자를 기준으로 나눌수 있다.
 		System.out.println(Arrays.toString(split));
		
 		System.out.println(str.replace("efg", "abcd"));  //문자열 내에있는 특정 문자열을 자신이 원하는 문자열로 바꿀수 있다.
 		
		for(String arg : args){
			System.out.println(arg);
		}
		
		//문제1. 숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요.
		setComma();
		//문제2. 하이픈(-)이 있는 전화번호를 입력받아 하이픈을 제거해 출력해주세요.
		removeHyphen();
		//문제3. 하이픈(-)이 없는 전화번호를 입력받아 하이픈을 삽입해 출력해주세요.
		removeHyphen();
		
		
		
	}

	private static void removeHyphen() {
		// TODO Auto-generated method stub
		
	}

	private static void setComma() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("입력 : ");
		String number = s.nextLine();
		String newNumber = "";
		
		int cnt = 0;
		
		for(int i = number.length() - 1; i >=0; i--){
			newNumber = number.charAt(i) + newNumber;
			
			cnt++;
			
			if(cnt % 3 == 0 && cnt != number.length()){
				newNumber = "," + newNumber;
			}
		}
				
		 System.out.println(newNumber);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

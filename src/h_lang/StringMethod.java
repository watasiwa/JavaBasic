package h_lang;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		/*
		 * equals()				: 문자열을 비교하여 같으면 true 다르면 false를 반환한다.
		 * length()				: 문자열의 길이를 반환한다.
		 * substring()			: 주어진 범위에 해당하는 문자열을 반환한다.
		 * charAt()				: 지정된 위치의 문자를 반환한다.
		 * indexOf() 				: 주어진 문자의 위치를 반환한다.
		 * lastIndexOf			: 주어진 문자의 마지막 위치를 반환한다.
		 * replace()				: 문자열 내의 주어진 문자(문자열)를 새로운 문자(문자열)로 바꾼 문자열을 반환한다.
		 * split()					: 문자열을 주어진 정규표현식과 일치하는 문자열로 나누어 문자열 배열로 반환한다.
		 * startsWith()			: 주어진 문자열로 시작하는지 여부를 반환한다.
		 * endWith()				: 주어진 문자열로 끝나는지 여부를 반환한다.
		 * toUpperCase()		: 문자열을 대문자로 변환한 문자열을 반환한다.
		 * toLowerCase()		: 문자열을 소문자로 변환한 문자열을 반환한다.
		 * trim()					: 양끝의 공백을 제거한 문자열을 반환한다. 
		 */
	
		
		String str = "abc abc  abc";
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("a",1));   //첫번쨰 a 이후 a자리를찾는거
		System.out.println(str.lastIndexOf("a"));
		
		System.out.println(str.replace("a", "0"));  // a가 0으로 바뀌어서 출력된다 
		System.out.println(str.replaceAll("[a-z]", "0"));  // abc가 모두 0으로 교체출력
		
		System.out.println(Arrays.toString(str.split(" ")));
		System.out.println(Arrays.toString(str.split(" +")));
		
		System.out.println(str.startsWith("a"));			//true
		System.out.println(str.startsWith("b"));			// false
		
		System.out.println(str.endsWith("c"));			//true
		System.out.println(str.endsWith("b"));			//false
	
		System.out.println(str.toUpperCase());			//ABC ABC  ABC
		System.out.println(str.toUpperCase().toLowerCase());  //abc abc  abc
		
		
		String str2 = " abc ";
		System.out.println(str2);
		System.out.println(str2.trim());		//양쪽 공백제거
		
		
		
		
		
		
		
	
	
	
	}

}

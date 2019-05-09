package h_lang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 *  정규표현식(Regular Expression) : 문자열의 패턴을 검사하는 표현식
		 *  
		 *  ^		뒷 문자로 시작   (^a) -- a로 시작하는 문자열을 검사
		 *  $		앞 문자로 종료   (a$) -- a로 끝나는지 검사
		 *  . 		임의의 문자(줄바꿈 제외)   											"(?=.*[$@$!%*?&])[a-zA-Z0-9!@#$%^&*()_+|]{8,20}"
		 *  *		앞 문자가 0개 이상		(a*)
		 *  +		앞 문자가 1개 이상		(a+)
		 *  ? 		앞 문자가 없거나 1개	(a?)
		 *  [] 		문자의 집합이나 범위 ([a-z] : a부터 z까지,
		 *  		[^a-z] : a부터 z가 아닌것
		 *  {}  		앞 문자의 개수 ({2} : 2개, {2,4} : 2개이상 4개 이하)
		 *  ()  		그룹화(1개의 문자처럼 인식)
		 *  |   		OR연상
		 *  \s   	공백, 탭, 줄바꿈
		 *  \S	  	공백, 탭, 줄바꿈이 아닌 문자
		 *  \w  	알파벳이나 숫자
		 *  \W  	알파벳이나 숫자가 아닌 문자
		 *  \d  	숫자
		 *  \D 	숫자가 아닌 문자
		 *  (?i) 	뒷 문자의 대소문자 구분 안함
		 *  \   	정규표현식에서 사용되는 특수문자 표현	
		 *
		 *	https: //regexr.com/
		 */
		
		//정규표현식 패턴만들기
		                                                                                                          
	//	 Pattern p = Pattern.compile("[a-z]{3}[0-9]{1,3}");
	//	 Pattern p = Pattern.compile("[a-z0-9]+");
	//	 Pattern p = Pattern.compile("\\w*");      // \w 를 사용하기위해서는 앞에 \를 하나더 붙여준다.
	//	 Pattern p = Pattern.compile(".*");
						
	//	 Pattern p = Pattern.compile("[a-z0-9]\\w{6,20}");  아이디
		Pattern p = Pattern.compile("(?=.*[?@!%*?&])[a-zA-Z0-9!@#$%^&*()_+|]{8,20}"); // 비번
	//	Pattern p = Pattern.compile("0\\d{1,2}-\\d{3,4}-\\d{3,4}"); // 전번
	 //   Pattern p = Pattern.compile("[a-zA-Z0-9]{6,20}@[a-z]{3,}.[a-z]{3,}");   // 이메일
		Matcher m = p.matcher("djf1733113");
		 System.out.println(m.matches());
	
		 //아이디, 비밀번호, 전화번호 ,이메일주소의 유효성을 검사하는 정규표현식을 만들어주세요.
		 
	//	 아이디 : Pattern p = Pattern.compile("[a-z0-9]\\w{6,20}");
	//	 비밀번호 :  Pattern p = Pattern.compile("(?=.*[?@!%*?&])[a-zA-Z0-9!@#$%^&*()_+|]{8,20}");  
	//	 전화번호 :	Pattern p = Pattern.compile("^0\\d{1,2}-\\d{3,4}-\\d{3,4}");
	//   이메일 : Pattern p = Pattern.compile("[a-zA-Z0-9]{6,20}@[a-z]{3,}.[a-z]{3,}");		
	//													\\w{6.20}@[a-zA-Z]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))	
		// 
	
	
	}
}

package test;

import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
/*		System.out.println(5+2);
		System.out.println(1.2+1.3);
		System.out.println(2*5);
		System.out.println(10/5);
		System.out.println('생'); 					//문자열
		System.out.println("생활코딩");
		System.out.println("생활코딩");
		System.out.println("생");
		System.out.println("생활코딩" + "입니다");
		System.out.println("1"+"1");
		System.out.println("egoing said \"welcome programming world\"");
		System.out.println("egoing said\n \"welcome programming world\"");
		System.out.println("egoing said\n \"welcome \n programming world\"");
//		
		
		int a = 1;
		System.out.println(a+1);   //2
		a = 2;
		System.out.println(a+2);
		
		int b;
		b = 1.1;      //1.1은 실수라서 int형 변수에 들어갈수없다.
		System.out.println(b + 1.1);
		
	String a, b;
	a = "coding";
	b = "everybody";
	System.out.println(a+b);

			float a = 2.2f;
			long b = 2315464892L;
			byte c = 100;
			short d =4000;
		
	double a = 3.0f;	
		float b =(float) 100.0;
		int c = (int)100.0f;
System.out.println(c);

		int result = 1+2;
		System.out.println(result);

		result = result -1;
		System.out.println(result);
		
		int a =3;
		System.out.println(0%3);
		System.out.println(1%3);
		System.out.println(2%3);
		System.out.println(3%3);
		System.out.println(4%3);
		System.out.println(5%3);
	
		String firstString = "This is";
		String SecondString = " a concatenated string";
		String ThirdString = firstString + SecondString;
		System.out.println(SecondString);
		
		
		   int a = 10;
	        int b = 3;
	          
	        float c = 10.0F;
	        float d = 3.0F;
	          
	        System.out.println(a/b);
	        System.out.println(c/d);
	        System.out.println(a/d);
		
	
		int i = 3;
        i++;       // i = i + 1;
        System.out.println(i); // 4 출력
        ++i;
        System.out.println(i); // 5 출력
        System.out.println(++i); // 6 출력
        System.out.println(i++); // 6 출력
        System.out.println(i); // 7 출력
			
		int a = 4 - 3*6;
		System.out.println(a);
	
		   if (false) {											//false이면 if문을 빠져나와서 마지막인 5만 출력된다.
	            System.out.println(1);
	            System.out.println(2);
	            System.out.println(3);
	            System.out.println(4);
	        }
	        System.out.println(5);
	*/   
		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<words.length;i++) {
		char[] question = words[i].toCharArray(); // String을 char[]로 변환

		// (1) 알맞은 코드를 넣어 완성하시오.
		for(int j =0;  j<question.length; j++){
		    int num =(int)(Math.random()*words.length);
			
			 char tmp = question[i];
			 question[i] = question[num];
			 question[num] = tmp;
			
		//char배열 question에 담긴 문자의 위치를 임의로 바꾼다.

		System.out.printf("Q%d. %s의 정답을 입력하세요.>",
		i+1, new String(question));
		String answer = scanner.nextLine();
		// trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
		if(words[i].equals(answer.trim()))
		System.out.printf("맞았습니다.%n%n");
		else
		System.out.printf("틀렸습니다.%n%n");
		
		
		
		
		
		
		}
		}
		}
		
	}



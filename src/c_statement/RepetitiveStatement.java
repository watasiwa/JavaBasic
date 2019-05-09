package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {
		/*
		 * 1. 반복문
		 * - for , while, do-while
		 * - 규칙적으로 반복되는 작업을 할때 사용한다.
		 * - 조건식이 만족하는 동안 계속 반복한다.
		 * 
		 * 2. for문
		 * - 반복횟수를 알 수 있을때 사용한다.
		 * - 조건식이 세부분으로 나뉘어 있다.(초기화; 조건식; 증감식;)
		 * - 1. 변수를 초기화 한다.
		 * - 2. 조건식을 주행해서 값을 얻는다.
		 * - 3. 조건식의 값이 true면 {}블럭안의 문장을 수행한다.
		 * - 4. 증감식을 수행한다.
		 * - 5. 조건식을 수행해서 값을 얻는다.
		 * - 6. 조건식의 값이 false이면 for문을 벗어난다.
		 * 
		 * 3. while문
		 * - 반복횟수를 알 수 없을떄 사용한다.
		 * - 조건식이 있어야 한다.
		 * - 조건식의 값이 true면 {}안의 문장을 수행하고 false이면 while문을 벗어난다.
		 * 
		 * 4. do-while문
		 * - while문의 변형이다.(while문과 동인한 특징을 가진다.)
		 * - while문과는 조건식과 {}의 순서가 다르다.
		 * - 최소 1번의 수행이 보장된다.
		 * 
		 * 5. break 와 continue
		 * - 반복문 안에서 특정조건에 반복문을 탈출하기 위해 사용한다.
		 * - 자신이 속한 가장 가까운 반복문 하나만 탈출한다.
		 * - break는 반복문을 완전히 탈출한다.
		 * - continue는 현재 수행하고 있는 반복회차만 탈출한다.
		 */
		
	/*	for(int i = 0; i < 10; i++){
			System.out.println(i);
		}

		int total = 0;
		
		for(int i = 1; i <= 100; i++){
			total = total + i;
			
		}
		System.out.println(total);
		
		for(int i = 100; i >= 1; i--){
			total = total * i;
		}
		System.out.println(total);
		
	
		for(int i = 1; i <= 9; i++){
			System.out.println("2*" + i + "=" + 2 * i);      // 구구단 2단하는법 
	
		}
		
		// 문제 1. 0부터 99까지 1씩 증가하는 반복문을 만들어주세요
		
		for(int i = 0; i <= 99; i ++){
			System.out.println(i);
		}
		
		// 문제 2. 1부터 50까지 3씩 증가하는 반복문을 만들어주세요.   증가는 <
		
		for(int i = 1; i <= 50; i += 3){
			System.out.println(i);
		}
		
		//문제 3. 100부터 1까지 1씩 감소하는 반복문을 만들어주세요.   감소는 >
		
		for(int i = 100; i >= 0; i --){
			System.out.println(i);
		}
		
		//문제 4. 1부터 1024까지 2배씩 증가하는 반복문을 만들어주세요.  
		
		for(int i = 1; i <= 1024; i *= 2){
			System.out.println(i);
		}
		
		//문제5. 1부터 100까지 짝수의 합을 출력해주세요.
		int sum = 0;
		sum = sum + 2;
		sum = sum + 4;
		sum = sum + 6;
		sum = sum + 8;
		sum = sum + 10;
		sum = sum + 12;
		sum = sum + 14;
		
		for(int i = 1; i <=100; i += 2){
			sum += i;
			System.out.println(sum);
		}
		
		for(int i = 1; i <= 100; i++){
			if(i % 2 == 0){
				sum += i;
				
			}
		}
		System.out.println(sum);
		
		//문제 6 1부터 100까지 3의 배수의 합을 출력해주세요.
		int sum1 = 0;
		
		for(int i = 1; i <= 100; i += 3){
			sum += i;
			System.out.println(sum1);
		}
		
		
		for(int i = 0; i <= 100; i ++){
			if(i % 3 == 0){
				sum1 += i;
			}
		}
		System.out.println(sum1);
		
		// 문제7. 구구단 3단을 출력해주세요.
		
		for(int i = 1; i <= 9 ; i ++ ){
			System.out.println("3*" + i + "=" + 3 * i);
		}
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 10; j++){
				System.out.print("*");
		}
			System.out.println();
	}
		
		for(int i = 1; i <= 5; i++){             // for문 중첩 가운데 
			for(int j = 0; j < i; j++){
				System.out.print("*");
		}
			System.out.println();
	}
		
		//문제 8. 구구단 전체를 출력해주세여.
		
		for(int i = 2; i <= 9 ; i ++ ){
			for(int o = 1; o < 10; o ++ ){
				System.out.println(i + "*" + o + "=" + i*o);
			}
		}
		
		//문제 9. 역삼각형 모양의 별을 출력해주세요
		
		for(int i = 5; i >= 1; i--){             //  
			for(int j = 0; j < i; j++){			
	//			System.out.print("*");
		}
	//		System.out.println();
	}
		
		// while 문
		
		int a = 0;
		while(a < 10){
//			System.out.println(a);
			a++;                     //  <<<증감식 작성하는곳
		}
		
		
		int num;
		int sum3 = 0;
		boolean flag = true;
		
//		System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0을 입력)");
		
		while(flag){
//			System.out.println(">>");
			
			Scanner scanner = new Scanner(System.in);
			int tmp = scanner.nextInt();
			num = tmp;
			
			if(num !=0 ){
				sum3 += num;
			} else{
				flag = false;}
						
		}
//		System.out.println("합계:" + sum);
		
		
		//do -while문
		
		do{
//			System.out.println(a);
			a++;
		}while(a < 20);
		
		
		int input = 0 , answer = 0;
		answer = (int)(Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		
		do{
//			System.out.print("1과 100사이의 정수를 입력하세요.>");
			input = scanner.nextInt();
			
			if(input > answer){
//				System.out.println("더 작은 수로 다시 시도하세요");
			} else if(input <answer){
//				System.out.println("더 큰 수로 다시 시도하세요");
				
			} 
		
		} while(input != answer);
//		System.out.println("정답입니다.");
		
	
		outer :
		
		for(int i = 2; i <+ 9; i++){
			for(int j = 1; j <= 9; j++){
2				if(j == 5){
					break outer;
				//	break;
				//	continue outer;
				//	continue;2
				}
//				System.out.println(i + "*" + j + "=" + i * j);
			}
//			System.out.println();
		}
*/		
		// 숙제1. 숫자를 입력받아 1부터 입력받은 수까지 홀수의 합과 짝수의 합을 구하시오.
	
		int num1 = 0, num2 = 0;
		
		System.out.println("숫자를 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();

		
		for(int i = 1; i < 21; i++){
				if(i % 2 == 0) {
					num1 += i;
				} else if (i % 2 != 0){
					num2 += i;
				}
		} System.out.println(num1);
		
		
		
		
		
	
		// 숙제2. 직각이 오른쪽에 있는 삼각형 모양의 별을 출력해주세요.
	
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	
		// 숙제3. 직각이 오른쪽에 있는 역삼각형 모양의 별을 출력해주세요.
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < i; j++){
				System.out.print(" ");
			}
		for(int j = 5; j > i; j--){
			System.out.print("*");
		} 
		System.out.println();
	}
	
				
		
		// 숙제4. 이등변 삼각형 모양의 별을 출력해주세요.
		
			for(int i = 0; i < 5; i++){
				for(int j = 0; j < 4 -i; j++){
					System.out.print(" ");
				}
				for(int j = 0; j <2* i+1; j++){
				System.out.print("*");
			} 
			System.out.println();
		}
			// 숙제5. 역 이등변 삼각형 모양의 별을 출력해 주세요.
				
			for(int i = 0; i < 5; i++){
				for(int j = 0; j < i; j++){
						System.out.print(" ");
				}
				for(int j = i; j < 5; j++ ){
					System.out.print("*");
				} 
				for(int j = i + 1; j < 5; j++){
				System.out.print("*");
				}
				System.out.println();
			}

			for(int i = 10; i > 0; i--){
				for(int j = 0; j < 10 - i; j++){
					System.out.print("");
				}
				for(int j = 0; j < i * 2 - 1; j++)      //홀수로 만들어주기 위해서 -1을 입력, 별이 2개씩 줄어들기때문에 i * 2
					System.out.print("*");
			}
				System.out.println();
	
	
	
	
		
					}
	
			
		
		
}
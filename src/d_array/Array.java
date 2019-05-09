package d_array;

import java.util.*;
public class Array {

	public static void main(String[] args) {
		/*
		 * 1. 배열
		 * - 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		 * 
		 * 2. 배열의 조건
		 * - int[] number = new int[5]; //기본값으로 초기화된다.
		 * - int[] number = new int[]{10, 20, 30, 40, 50};
		 * - int[] number = {10, 20, 30, 40, 50};
		 * 
		 * 3. 배열의 사용
		 * - 변수명[인덱스](number[0])
		 * - 인덱스는 0부터 시작
		 * - 배열의 길이는 변수명. length(number.length)
		 * - 배열의 출력은 Arrays.toString();
		 * - 배열의 정렬은 Arrays.sort();
		 * - 배열의 복사는 System.arraycopy();
		 * - 향상된 for문 for(변수선언 : 배열){}
		 */
		
		int[] numbers = new int[5];						// 5 = 저장공간 ,
		int[] numbers2 = new int[]{1, 2, 3, 4, 5,};
		int[] numbers3 = {1, 2, 3, 4, 5,};				//선언과 동시에 할때만 가능함.
		
		System.out.println(Arrays.toString(numbers));
		
		numbers[0] = 1;   // 첫번째 공간에 1을 넣겠다라는 수식
		numbers[1] = 2;
		numbers[2] = numbers[0] + numbers[1];
		numbers[3] = numbers[2] * 2;
		numbers[4] = numbers[3] > numbers[2] ? numbers[3] : numbers[2];           //마지막 인덱스는 배열의 길이 -1 이다.
		
		
		for(int i = 0; i < numbers.length; i++){								// 배열의 숫자는 거의 직접입력하지않는다. 5 -> numbers.length로 교체
			System.out.println(numbers[i]);
		}
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = numbers.length - i;
		}
		System.out.println(Arrays.toString(numbers));
 
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	 
		int[] copyNumbers = new int[10];
		System.arraycopy(numbers, 0, copyNumbers, 0, 5);
		System.out.println(Arrays.toString(copyNumbers));
		
		
		for(int number : numbers){								// 향상된  for문  - 
			System.out.println(number);
		}
		
		for(int number : numbers){								 
			number = 10;  // numbers에 대입되지 않는다.
		
		}
		System.out.println(Arrays.toString(numbers));
		
		
		
		//예제 5-5
		
		int sum = 0;
		float average = 0f;
		
		int[] score = { 100, 88, 100, 100, 90};
		
		for(int i = 0; i < score.length; i++){
			sum += score [i];
		}
		average = sum / (float)score.length;
		System.out.println("총합 :" + sum);
		System.out.println("총평균 :" + average);
		
		
		//예제 5-6
		
		int [] score1= { 79, 88, 91, 33, 100, 55, 95};
		
		int max = score1[0];
		int min = score1[0];
		
		for(int i = 1; i < score1.length; i++){
			if(score1[i] > max){
				max = score1[i];
			} else if(score1[i] < min){
				min = score1[i];
			}
		}
		System.out.println("최대값 :" + max);
		System.out.println("최소값 :" + min);
		
		
		//예제 5-7
		
		int[] number0 = new int[10];
		
		for(int i = 0; i < number0.length; i++){
			number0[i] = i;
			System.out.print(number0[i]);
		}
		System.out.println();
		
		for (int i = 0; i < 100; i++) {
			int j = (int)(Math.random()* 10);
			int tmp = number0[0];
			number0[0] = number0[j];
			number0[j] = tmp;
			
		}
		for(int i =0; i < number0.length; i++){
			System.out.print(number0[i]);
		}
		
		//예제 5-8
		
		int[] ball = new int[45];
		
		for(int i = 0; i < ball.length; i++){
			
		}
		
		
		Math.random();  //0이상 1미만의 값을 반환  0~ 0.999999까지 나옴
		
		// 0.0~ 0.9 10을 곱하면 0 ~ 9 1을 더해주면 1 ~ 10
		//
		// int a = (int)(Math.random()) * 6
		
		//문제1   1~10사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		
		int [] gae = new int[10];
				
		for(int i = 0; i < 500; i++){
			int j = (int)(Math.random()* 10) + 1;
			gae[j -1] += 1;
		
		}
		
		for(int i = 0; i <gae.length; i++){
			System.out.println((i + 1) + "번 = " + gae[i] );
		}
		
		
		
			
		inputRandomCount();
	}

	private static void inputRandomCount() {
		//1번의 최소값, 최대값, 반복횟수를 입력받아 각 숫자가 생성된 횟수를 출력해주세요.
		
		
		
		Scanner Scanner = new Scanner(System.in);
		Scanner a = new Scanner(System.in);
		System.out.print("최소값 : ");
		int min = a.nextInt();
		System.out.print("최대값 : ");
		int max = a.nextInt();
		System.out.print("반복횟수 :");
		int count = a.nextInt();
		
		int val = max - min + 1;
		int [] number = new int[val];
		for(int i = 0; i < val; i++){
			int j = (int)(Math.random() * val) + min;
			number[j - min] ++;
		}
		System.out.println();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
}

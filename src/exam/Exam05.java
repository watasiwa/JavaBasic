package exam;

public class Exam05 {

	public static void main(String[] args) {
/*
 * [5-1] 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명하시오.	
 * 			답: d,
a. int[] arr[];									
b. int[] arr = {1,2,3,};
c. int[] arr = new int[5];
d. int[] arr = new int[5]{1,2,3,4,5};           //[]에 숫자를 넣으면 안됨
e. int arr[5];									//선언할때는 배열길이를 지정할수없다.
f. int[] arr[] = new int[3][];


[5-2] 다음과 같은 배열이 있을 때, arr[3].length의 값은 얼마인가?  답 2 
int[][] arr = {
{ 5, 5, 5, 5, 5},
{ 10, 10, 10},
{ 20, 20, 20, 20},
{ 30, 30}
};
 
 *
 *[5-3] 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
[연습문제]/ch5/Exercise5_3.java
class Exercise5_3
{
public static void main(String[] args)
{
int[] arr = {10, 20, 30, 40, 50};
int sum = 0;
/*
/* (1) for(int i = 0; i < arr.length; i++){
			sum += arr [i];
/*
System.out.println("sum="+sum);
}
}
[실행결과]
sum=150
 *
 *[5-4] 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
[연습문제]/ch5/Exercise5_4.java
class Exercise5_4
{
public static void main(String[] args)
{
int[][] arr = {
{ 5, 5, 5, 5, 5},
{10,10,10,10,10},
{20,20,20,20,20},
{30,30,30,30,30}
};

int total = 0;
float average = 0;
/*
(1) 알맞은 코드를 넣어 완성하시오.		
		for(int i = 0; i < arr.length; i++){
		}
			for(int j =0; j < arr[i].length; j ++{
			total += arr [i][j];
		}
	
		average =(float) total / (arr.length * arr[i].length);
		System.out.println("총합 :" + total);
		System.out.println("총평균 :" + average);

System.out.println("total="+total);
System.out.println("average="+average);
} // end of main
} // end of class
[실행결과]
total=325
average=16.25
 *
 *
 *[5-5] 다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프
로그램이다. (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
[참고] Math.random()을 사용했기 때문에 실행결과와 다를 수 있다.
[연습문제]/ch5/Exercise5_5.java
class Exercise5_5 {
public static void main(String[] args) {
int[] ballArr = {1,2,3,4,5,6,7,8,9};
int[] ball3 = new int[3];
// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.

for(int i=0; i< ballArr.length;i++) {
	int j = (int)(Math.random() * ballArr.length);
	int tmp = 0;
(1) 알맞은 코드를 넣어 완성하시오.
tmp = ballArr[i]; 
ballArr[i] = ballArr[j];
ballArr[j] = tmp;

}
// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
 (2)  System.arraycopy(ballArr, 0, ball3, 0, 3);
for(int i=0;i<ball3.length;i++) {
System.out.print(ball3[i]);
}
} // end of main
} // end of class
[실행결과]
486
 *
 *
 *
 *[5-6] 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 변
수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하
라. 단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다. (1)에 알맞은 코드를 넣어서
프로그램을 완성하시오.
[Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다.
[연습문제]/ch5/Exercise5_6.java
class Exercise5_6 {
public static void main(String args[]) {
// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
int[] coinUnit = {500, 100, 50, 10};

int money = 2680;
System.out.println("money="+money);

for(int i=0;i<coinUnit.length;i++) {
/*
(1) 알맞은 코드를 넣어 완성하시오.
	System.out.println(coinUnit[i] + "원 :" + money/coinUnit[i]);
	monny = money%coinUnit[i]; 	
 }
} // main
}
[실행결과]
money=2680
500원: 5
100원: 1
50원: 1
10원: 3
 *
[5-7] 문제 5-6에 동전의 개수를 추가한 프로그램이다. 커맨드라인으로부터 거슬러 줄
금액을 입력받아 계산한다. 보유한 동전의 개수로 거스름돈을 지불할 수 없으면, ‘거스름
돈이 부족합니다.’라고 출력하고 종료한다. 지불할 돈이 충분히 있으면, 거스름돈을 지불
한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다. (1)에 알맞은 코드를 넣
어서 프로그램을 완성하시오.
class Exercise5_7{
public static void main(String args[]){

if(args.length!=1) {
	System.out.println("USAGE: java Exercise5_7 3120");
	System.exit(0);
}
// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.

int money = Integer.parseInt(args[0]);

System.out.println("money="+money);

int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수

for(int i=0;i<coinUnit.length;i++) {
	 int coinNum = 0;
  * (답)
  * coinNum = money/coinUnit[i];
 *
 *  if(coin[i] >= coinNum) {				// 2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
 *  coin[i] -= coinNum;					// (만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
	} else {
		coinNum = coin[i];
		coin[i] = 0;
}
// 3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다. 
 * money -= coinNum*coinUnit[i];
 
System.out.println(coinUnit[i]+"원: "+coinNum);
}
if(money > 0) {
System.out.println("거스름돈이 부족합니다.");
System.exit(0); // 프로그램을 종료한다.
}
System.out.println("=남은 동전의 개수 =");
for(int i=0;i<coinUnit.length;i++) {
} 

*[5-8] 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’
을 찍어서 그래프를 그리는 프로그램이다. (1)~(2)에 알맞은 코드를 넣어서 완성하시오.
[연습문제]/ch5/Exercise5_8.java
class Exercise5_8 {
public static void main(String[] args) {
int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
int[] counter = new int[4];
for(int i=0; i < answer.length;i++) {
(1)
	counter[answer[i]-1]++;
}
for(int i=0; i < counter.length;i++) {
	System.out.print((i+1) + "번" + counter[i]);
(2) for(int j = 0; j <counter.length; j++)

}
System.out.println();
}
} // end of main
} // end of class
*
[실행결과]
3***
2**
2**
4*****
*
*[5-9] 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.
*class Exercise5_9 {
public static void main(String[] args) {
char[][] star = {
{'*','*',' ',' ',' '},
{'*','*',' ',' ',' '},
{'*','*','*','*','*'},
{'*','*','*','*','*'}
};
char[][] result = new char[star[0].length][star.length];
for(int i=0; i < star.length;i++) {
for(int j=0; j < star[i].length;j++) {
System.out.print(star[i][j]);
}System.out.println();
}
System.out.println();
for(int i=0; i < star.length;i++) {
for(int j=0; j < star[i].length;j++) {

(1) 알맞은 코드를 넣어 완성하시오.
 result[j][i]=star[3-i][j];
}
for(int i=0; i < result.length;i++) {
for(int j=0; j < result[i].length;j++) {
System.out.print(result[i][j]);
}System.out.println();
}
} // end of main
} // end of class
*
*[실행결과]
	**
	**
	*****
	*****
	****
	****
	**
	**
	**
*
*[5-10] 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
(1)에 알맞은 코드를 넣어서 완성하시오.
[연습문제]/ch5/Exercise5_10.java
class Exercise5_10 {
public static void main(String[] args) {
char[] abcCode =
{ '`','~','!','@','#','$','%','^','&','*',
'(',')','-','_','+','=','|','[',']','{','}',';',':',',','.','/'};
// 0 1 2 3 4 5 6 7 8 9
char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
String src = "abc123";
String result = "";
// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
for(int i=0; i < src.length();i++) {
char ch = src.charAt(i);
/*
(1) 알맞은 코드를 넣어 완성하시오.
if('a' <= ch && ch <= 'z' ){
	result += abcCode[ch - 'a'];
	} else if ('0' <= ch && ch <= '9'){
		result += numCode[ch -'0'];
		}
	}
System.out.println("src:"+src);
System.out.println("result:"+result);
} // end of main
} // end of class
0 1 2 3 4 5 6 7 8 9
q w e r t y u i o p
u v w x y z
} ; : , . /
a b c d e f g h i j k l m n o p q r s t
` ~ ! @ # $ % ^ & * ( ) - _ + = | [ ] {
[실행결과]
*src:abc123
*result:`~!wer
*
*[5-11] 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열
의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다. (1)
에 알맞은 코드를 넣어서 완성하시오.
*
*
*class Exercise5_11
{
public static void main(String[] args)
{
int[][] score = {
{100, 100, 100}
, {20, 20, 20}
, {30, 30, 30}
, {40, 40, 40}
, {50, 50, 50}};
int[][] result = new int[score.length+1][score[0].length+1];
for(int i=0; i < score.length;i++) {
	for(int j=0; j < score[i].length;j++) {

(1) 알맞은 코드를 넣어 완성하시오.
	result[i][j] = score[i][j];
	result[i][result[o].length -1] += score[i][j];
	result[result.length - 1][j] += score[i][j];
	result[result.length - 1][result[0].length - 1] += result[i][j];
 }
}
for(int i=0; i < result.length;i++) {
for(int j=0; j < result[i].length;j++) {
System.out.printf("%4d",result[i][j]);
}System.out.println();
}
} // main
}
[실행결과]
100 100 100 300
20 20 20 60
30 30 30 90
40 40 40 120
50 50 50 150
240 240 240 720
*
*
*
*
*
*
*
*
*
*[5-13] 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다. 실행결과와
같이 동작하도록 예제의 빈 곳을 채우시오.


import java.util.Scanner;
class Exercise5_13 {
public static void main(String args[]) {
String[] words = { "television", "computer", "mouse", "phone" };
Scanner scanner = new Scanner(System.in);
for(int i=0;i<words.length;i++) {
char[] question = words[i].toCharArray(); // String을 char[]로 변환

(1) 알맞은 코드를 넣어 완성하시오.
for(int j =0;  j<question.length; j++){
    int num =(int)(Math.random()*words.length);
	
	 char tmp = question[i];
	 question[i] = question[num];
	 question[num] = tmp;
	
char배열 question에 담긴 문자의 위치를 임의로 바꾼다.

System.out.printf("Q%d. %s의 정답을 입력하세요.>",
i+1, new String(question));
String answer = scanner.nextLine();
// trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
if(words[i].equals(answer.trim()))
System.out.printf("맞았습니다.%n%n");
else
System.out.printf("틀렸습니다.%n%n");
}
} // main의 끝
}
*
*
*
*/

	
	
	}

}

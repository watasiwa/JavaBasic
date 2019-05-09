package c_statement;

import java.util.Scanner;

public class switchclass {

	public static void main(String[] args) {
		int month = 7;
		String season = "";
		switch (month) {
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		default:
			break;

		}
		System.out.println(season);

		int score = 0;
		char grade = ' ';
		System.out.println("당신의 점수를 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();

		switch (score / 10) {
		case 10 :
		case 9 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		case 6 :
			grade = 'D';
			break;
		default :
			grade = 'F';
			break;

		}
		System.out.println("당신의 학점은 " + grade + "입니다.");
		
		
	}

}

package test;

import java.util.Arrays;

import d_array.Sort;

public class StarPinting {

	public static void main(String[] args) {

		for(int i = 0; i < 5; i++){
			for(int j =0; j <5; j++){
			System.out.print("*");
	}
		System.out.println();
	}
	
		//이등변 삼각형
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5-i; j++){
				System.out.print(" ");
			}
			for(int j = 0; j < 2 * i +1;  j++){					//홀수로 찍히게하는 식
				System.out.print("*");
			}
			System.out.println();
		}
		

		//역
		for(int i = 1; i <= 5; i++){
			for(int j = 1; j < i; j++){
				System.out.printf(" ");
			}
		
			for(int j = 10; j-i >= i; j-- ){
				System.out.print("*");
			}
			System.out.println("");
		}
	
		
		for(int i = 1; i <6; i++){
			for(int j = 0; j < i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//배열
		
		int [] number1 = new int[10];
		int [] number2= new int[10];
		int [] number3 ={100, 95, 80, 70, 60};
		char[] charr = {'a', 'b', 'c', 'd',};
		
		//1~10의 숫자를 순서대로 배열에 넣는 로직
		for(int i =0; i <number1.length; i++){
			number1[i] = i +1;
		}
		//1~10의 값을 배열에 저장하는 로직
		for(int i =0; i < number2.length; i++){
			number2[i] = (int)(Math.random()* 10) +1;
		}
		
		// 배열에 저장된 값들을 출력하는 로직
		for(int i = 0; i < number1.length; i++){
			System.out.println(number1[i]+ " , ");
		}
		System.out.println();
		System.out.println(Arrays.toString(number1));
		System.out.println(Arrays.toString(number2));
		System.out.println(Arrays.toString(number3));
		System.out.println(Arrays.toString(charr));
		System.out.println(number3);
		System.out.println(charr);
		
		int[] arr = new int[3];
		int[] tmp = new int [arr.length * 2];
		
		for(int i = 0; i < arr.length; i++){
			tmp[i] = arr[i];
			arr = tmp;
			System.out.println(tmp[i]);
		}	
	
		//예제 5-1
		int[] number = new int [10];
		int[] count	= new int [10];
		
		for(int k = 0; k <number.length; k++){
			number[k] = (int)(Math.random() * 10);
			System.out.print(number[k]+ " ");
		}
		System.out.println();				
		
		for(int k = 0; k < number.length; k++){
			count[number[k]]++;
		}
		
		for(int k =0; k <number.length; k++){
			System.out.println(k + "의 개수 :" + count[k]);
		}
	
		//String 배열
		//예제 5-14
		String str = "ABCDE";
		
		for(int i = 0; i <str.length(); i++){
			char ch = str.charAt(i);
			System.out.println("srt.charAt("+i+") : " + ch);
		}
		char[] chArr = str.toCharArray();
			System.out.println(chArr);

			
			
			
			scoreRank();	
	}

	private static void scoreRank() {
		
		String [] Subjects = {"이름" , "java" , "Oracle" , "HTML" , " JQuery" , " JSP "};
		String [] Student = { "강현욱", "김난경","신유수","김도현","김주은","김지연","김현기","김현지","노대현","박경훈","박선희","박정권",
							"박지선", "윤상호", "윤한수","이대용","이준호","이한화","임재우","장구현","진민규","하준용","한상호","황수정"};

			
		for(int i = 0; i < Subjects.length; i++){
			System.out.print(Subjects[i] + " \t");
		}
			System.out.println();
		for(int i = 0; i < Student.length; i++){
			System.out.print(Student[i] + "\n");
		}
					
		int [][] scores = new int [24][9];
		
		for(int i = 0 ; i < scores.length; i++){
			for(int j = 0 ; j < scores[j].length; j++){
				scores[i][j] = (int)(Math.random() * 50) +50;
				System.out.print(scores[i][j]);
			}
	     }		
		
		int total[] = new int[25];
			for( int i = 0; i < total.length; i++){
				for(int j = 0; j < total.length; j++){
					total[i] += scores[i][j];
				}
			}
		
		int average[] = new int[25];
			for(int i = 0; i < average.length; i++){
				average[i] += total[i] / Subjects.length; 
			}
	
		int Rank[] = new int[25];
			for(int i = 0; i < Rank.length; i++){
				Rank[i] = 1;
			}
				for (int i = 0; i < total.length; i++) {
					for (int j = 0; j < total.length; j++) {
						if (total[i] < total[j]) {
							Rank[i]++;
			}
		 }
	}
	}
	
}

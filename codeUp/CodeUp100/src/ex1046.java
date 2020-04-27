/*
 * 1046 : [기초-산술연산] 정수 3개 입력받아 합과 평균 출력하기
 * 정수 3개를 입력받아 합과 평균을 출력해보자.
 * 단, -2147483648 ~ +2147483647
 * */

import java.util.Scanner;

public class ex1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a + b + c;
		float average = ((float)a + (float)b + (float)c)/3;
		System.out.println(sum);
		System.out.format("%.1f", average);
		sc.close();
	}

}

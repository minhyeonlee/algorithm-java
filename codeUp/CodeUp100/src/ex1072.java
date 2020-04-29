/*
 * 1072 : [기초-반복실행구조] 정수 입력받아 계속 출력하기(설명) 1070 : [기초-조건/선택실행구조] 월 입력받아 계절 출력하기(설명) 
 * n개의 정수가 순서대로 입력된다.
 * -2147483648 ~ +2147483647, 단 n의 최대 개수는 알 수 없다.
 * n개의 입력된 정수를 순서대로 출력해보자.
 * */

import java.util.Scanner;

public class ex1072 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x;
		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			System.out.println(x);
		}
		sc.close();
	}

}

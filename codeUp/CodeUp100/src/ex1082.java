/*
 * 1082 : [기초-종합] 16진수 구구단?
 * 16진수(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F)를 배운
 * 영일(01)이는 16진수끼리 곱하는 16진수 구구단?에 대해서 궁금해졌다.
 * */

import java.util.Scanner;

public class ex1082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String hNum = sc.next();

		int num = Integer.parseInt(hNum, 16);
		for (int i = 1; i < 16; i++) {
			System.out.format("%X*%X=%X%n", num, i, num * i);
		}
		sc.close();
	}

}

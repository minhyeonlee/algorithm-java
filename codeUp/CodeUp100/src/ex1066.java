/*
 * 1066 : [기초-조건/선택실행구조] 정수 3개 입력받아 짝/홀 출력하기(설명)
 * 세 정수 a, b, c가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자.
 * */

import java.util.Scanner;

public class ex1066 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

		if (b % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

		if (c % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

		sc.close();
	}

}

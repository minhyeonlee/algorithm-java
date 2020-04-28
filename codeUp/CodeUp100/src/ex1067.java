/*
 * 1067 : [기초-조건/선택실행구조] 정수 1개 입력받아 분석하기(설명)
 * 정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
 * */

import java.util.Scanner;

public class ex1067 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a < 0) {
			System.out.println("minus");
			if (a % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		} else {
			System.out.println("plus");
			if (a % 2 == 0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}

		sc.close();
	}

}

/*
 * 1077 : [기초-반복실행구조] 정수 1개 입력받아 그 수까지 출력하기(설명)
 * 정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 출력해보자.
 * */

import java.util.Scanner;

public class ex1077 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			System.out.println(i);
		}
		sc.close();
	}

}

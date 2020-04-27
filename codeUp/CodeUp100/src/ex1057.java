/*
 * 1057 : [기초-논리연산] 참/거짓이 서로 같을 때에만 참 출력하기
 * 두 개의 참(1) 또는 거짓(0)이 입력될 때,
 * 참/거짓이 서로 같을 때에만 참이 계산되는 프로그램을 작성해보자.
 * */

import java.util.Scanner;

public class ex1057 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a == b ? 1 : 0);
		sc.close();
	}

}

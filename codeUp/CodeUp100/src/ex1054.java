/*
 * 1054 : [기초-논리연산] 둘 다 참일 경우만 참 출력하기(설명)
 * 두 개의 참(1) 또는 거짓(0)이 입력될 때,
 * 모두 참일 때에만 참을 출력하는 프로그램을 작성해보자.
 * */

import java.util.Scanner;

public class ex1054 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a & b);
		sc.close();
	}

}

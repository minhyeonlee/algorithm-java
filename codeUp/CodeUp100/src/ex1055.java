/*
 * 1055 : [기초-논리연산] 하나라도 참이면 참 출력하기(설명)
 * 두 개의 참(1) 또는 거짓(0)이 입력될 때,
 * 하나라도 참이면 참을 출력하는 프로그램을 작성해보자.
 * */

import java.util.Scanner;

public class ex1055 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a | b);
		sc.close();
	}

}

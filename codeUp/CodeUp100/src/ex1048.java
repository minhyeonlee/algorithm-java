/*
 * 1048 : [기초-비트시프트연산] 한 번에 2의 거듭제곱 배로 출력하기(설명)
 * 정수 2개(a, b)를 입력받아 a를 2b배 곱한 값으로 출력해보자.
 * 0 <= a <= 10, 0 <= b <= 10
 * */

import java.util.Scanner;

public class ex1048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a<<b);
		sc.close();
	}

}

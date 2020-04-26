/*
 * 1040 : [기초-산술연산] 정수 1개 입력받아 부호 바꿔 출력하기(설명)
 * 입력된 정수의 부호를 바꿔 출력해보자.
 * 단, -2147483647 ~ +2147483647 범위의 정수가 입력된다.
 * */

import java.util.Scanner;

public class ex1040 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = x * (-1);
		System.out.println(y);
		
		sc.close();
	}

}

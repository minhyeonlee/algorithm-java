/*
 * 1039 : [기초-산술연산] 정수 2개 입력받아 합 출력하기2(설명)
 * 정수 2개를 입력받아 합을 출력해보자.
 * 단, 입력되는 정수는 -2147483648 ~ +2147483648 이다.
 * */

import java.util.Scanner;

public class ex1039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();

		System.out.println(x + y);
		
		sc.close();
	}

}

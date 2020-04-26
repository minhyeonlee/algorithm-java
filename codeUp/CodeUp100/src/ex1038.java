/*
 * 1038 : [기초-산술연산] 정수 2개 입력받아 합 출력하기1(설명)
 * 정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자.
 * */

import java.util.Scanner;

public class ex1038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		
		System.out.println(x + y);
		
		sc.close();
	}

}

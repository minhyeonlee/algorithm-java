/*
 * 1043 : [기초-산술연산] 정수 2개 입력받아 나눈 나머지 출력하기(설명)
 * 정수 2개(a, b) 를 입력받아 a를 b로 나눈 나머지를 출력해보자.
 * 단, 0 <= a, b <= +2147483647, b는 0이 아니다.
 * */

import java.util.Scanner;

public class ex1043 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		
		int result = (int)(x%y);
		System.out.println(result);
		
		sc.close();
	}

}

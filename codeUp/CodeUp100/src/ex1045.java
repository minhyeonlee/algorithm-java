/*
 * 1045 : [기초-산술연산] 정수 2개 입력받아 자동 계산하기
 * 정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값을 자동으로 계산해보자.
 * 단 0 <= a, b <= 2147483647, b는 0이 아니다.
 * */

import java.util.Scanner;

public class ex1045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x/y);
		System.out.println(x%y);
		System.out.format("%.2f", (float)x/(float)y);
		
		sc.close();
	}

}

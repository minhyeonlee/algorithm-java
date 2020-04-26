/*
 * 1044 : [기초-산술연산] 정수 1개 입력받아 1 더해 출력하기(설명)
 * 정수를 1개 입력받아 1만큼 더해 출력해보자.
 * 단, -2147483648 ~ +2147483647 의 범위로 입력된다.
 * */

import java.util.Scanner;

public class ex1044 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
	
		System.out.println(x + 1);
		
		sc.close();
	}

}

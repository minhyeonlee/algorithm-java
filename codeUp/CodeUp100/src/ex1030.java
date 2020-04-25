/*
 * 1030 : [기초-데이터형] 정수 1개 입력받아 그대로 출력하기3(설명)
 * 정수 1개를 입력받아 그대로 출력해보자.
 * 단, 입력되는 정수의 범위는
 * -9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807 이다.
 * */

import java.util.Scanner;
public class ex1030 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();

		System.out.println(num);

	}

}

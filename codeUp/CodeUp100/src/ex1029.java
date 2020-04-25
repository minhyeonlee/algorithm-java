/*
 * 1029 : [기초-데이터형] 실수 1개 입력받아 그대로 출력하기2(설명)
 * 실수 1개를 입력받아 그대로 출력해보자.
 * (단, 입력되는 실수의 범위는 +- 1.7*10-308 ~ +- 1.7*10308 이다.)
 * */

import java.util.Scanner;
public class ex1029 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();

		System.out.printf("%.11f", num);

	}

}

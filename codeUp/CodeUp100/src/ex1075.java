/*
 * 1075 : [기초-반복실행구조] 정수 1개 입력받아 카운트다운 출력하기2(설명)
 * 정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
 * */

import java.util.Scanner;

public class ex1075 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (n = n - 1; n >= 0; n--) {
			System.out.println(n);
		}
		sc.close();
	}

}

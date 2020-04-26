/*
 * 1036 : [기초-출력변환] 영문자 1개 입력받아 10진수로 출력하기(설명)
 * 영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력해보자.
 * */

import java.util.Scanner;

public class ex1036 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);

		int num = ch;
		System.out.println(num);

		sc.close();
	}

}

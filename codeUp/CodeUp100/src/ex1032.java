/*
 * 1032 : [기초-출력변환] 10진 정수 입력받아 16진수로 출력하기1(설명)
 * 10진수를 입력받아 16진수(hexadecimal)로 출력해보자.
 * */

import java.util.Scanner;

public class ex1032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String hNum = Integer.toHexString(num);
		System.out.println(hNum);
		
		sc.close();
	}

}

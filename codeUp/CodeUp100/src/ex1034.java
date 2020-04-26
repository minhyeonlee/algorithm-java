/*
 * 1034 : [기초-출력변환] 8진 정수 1개 입력받아 10진수로 출력하기(설명)
 * 8진수로 입력된 정수 1개를 10진수로 바꾸어 출력해보자.
 * */

import java.util.Scanner;

public class ex1034 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String oNum = sc.next();

		int num = Integer.valueOf(oNum, 8);
		System.out.println(num);
		
		sc.close();

	}

}

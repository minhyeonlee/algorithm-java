/*
 * 1031 : [기초-출력변환] 10진 정수 1개 입력받아 8진수로 출력하기(설명)
 * 10진수를 입력받아 8진수(octal)로 출력해보자.
 * */

import java.util.Scanner;

public class ex1031 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		String oNum = Integer.toOctalString(num);
		System.out.println(oNum);
		
		sc.close();

	}

}

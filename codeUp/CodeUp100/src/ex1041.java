/*
 * 1041 : [기초-산술연산] 문자 1개 입력받아 다음 문자 출력하기(설명) 
 * 영문자 1개를 입력받아 그 다음 문자를 출력해보자.
 * */

import java.util.Scanner;

public class ex1041 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		int num = (int)ch + 1;
		System.out.println((char)num);
		
		sc.close();
	}

}

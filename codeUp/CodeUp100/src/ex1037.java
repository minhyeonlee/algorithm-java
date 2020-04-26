/*
 * 1037 : [기초-출력변환] 정수 입력받아 아스키 문자로 출력하기
 * 10진 정수 1개를 입력받아 아스키 문자로 출력해보자.
 * */

import java.util.Scanner;

public class ex1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		char ch = (char)num;
		System.out.println(ch);
	
		sc.close();
	}

}

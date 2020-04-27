/*
 * 1047 : [기초-비트시프트연산] 정수 1개 입력받아 2배 곱해 출력하기(설명)
 * 정수 1개를 입력받아 2배 곱해 출력해보자.
 * */

import java.util.Scanner;

public class ex1047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a << 1);
		sc.close();
	}

}

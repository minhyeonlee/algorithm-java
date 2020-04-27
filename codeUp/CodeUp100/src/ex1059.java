/*
 * 1059 : [기초-비트단위논리연산] 비트단위로 NOT 하여 출력하기(설명)
 * 입력 된 정수를 비트단위로 참/거짓을 바꾼 후 정수로 출력해보자.
 * 비트단위(bitwise)연산자 ~ 를 붙이면 된다.(~ : tilde, 틸드라고 읽는다.)
 * */

import java.util.Scanner;

public class ex1059 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println(~a);
		sc.close();
	}

}

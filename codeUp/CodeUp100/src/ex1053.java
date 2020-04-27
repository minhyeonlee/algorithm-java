/*
 * 1053 : [기초-논리연산] 참 거짓 바꾸기(설명)
 * 1(true, 참) 또는 0(false, 거짓) 이 입력되었을 때
 * 반대로 출력하는 프로그램을 작성해보자.
 * */

import java.util.Scanner;

public class ex1053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a == 1 ? 0 : 1);
		sc.close();
	}

}

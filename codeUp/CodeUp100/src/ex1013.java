/*
 * 1013 : [기초-입출력] 정수 2개 입력받아 그대로 출력하기(설명)
 * 정수(int) 2개를 입력받아 그대로 출력해보자.
 * */

import java.util.Scanner;

public class ex1013 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.print(a + " " + b);
		input.close();

	}

}

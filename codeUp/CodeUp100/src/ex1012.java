/*
 * [기초-입출력] 실수 1개 입력받아 그대로 출력하기(설명)
 * 실수형(float)로 변수를 선언하고 그 변수에 실수값을 저장한 후 저장되어 있는 실수값을 출력해보자.
 * */

import java.util.Scanner;

public class ex1012 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float n = input.nextFloat();
		System.out.format("%f", n);
		
		input.close();
	}

}

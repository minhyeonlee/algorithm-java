/*
 * 1015 : [기초-입출력] 실수 입력받아 둘째 자리까지 출력하기(설명)
 * 실수(float) 1개를 입력받아 저장한 후,
 * 저장되어 있는 값을 소수점 셋 째 자리에서 반올림하여 소수점 이하 둘 째 자리까지 출력하시오.
 **/

import java.util.Scanner;

public class ex1015 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float n = sc.nextFloat();
		System.out.printf("%.2f", n);

		sc.close();
	}

}

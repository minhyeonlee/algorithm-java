/*
 * 1085 : [기초-종합] 소리 파일 저장용량 계산하기(설명)
 * h, b, c, s 가 공백을 두고 입력된다.
 * h는 48,000이하, b는 32이하(단, 8의배수), c는 5이하, s는 6,000이하의 자연수이다.
 * 필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
 * 단, 소수점 둘째 자리에서 반올림해 첫째 자리까지 출력하고 MB를 공백을 두고 출력한다.
 * */

import java.util.Scanner;

public class ex1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float h = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		float s = sc.nextFloat();

		float number = h * b * c * s;
		float BYTE = number / 8;
		float KB = BYTE / 1024;
		float MB = KB / 1024;

		System.out.format("%.1f %s", MB, "MB");

		sc.close();
	}

}

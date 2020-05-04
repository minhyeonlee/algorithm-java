/*
 * 1086 : [기초-종합] 그림 파일 저장용량 계산하기(설명)
 * w, h, b 가 공백을 두고 입력된다.
 * 단, w, h는 모두 정수이고 1~1024 이다. b는 40이하의 4의 배수이다.
 * 필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
 * 소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력한 뒤 MB를 출력한다.
 * */

import java.util.Scanner;

public class ex1086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float w = sc.nextFloat();
		float h = sc.nextFloat();
		float b = sc.nextFloat();

		float number = w * h * b;
		float BYTE = number / 8;
		float KB = BYTE / 1024;
		float MB = KB / 1024;

		System.out.format("%.2f %s", MB, "MB");

		sc.close();
	}

}

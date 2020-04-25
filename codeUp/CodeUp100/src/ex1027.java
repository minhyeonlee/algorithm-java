/*
 * 1027 : [기초-입출력] 년월일 입력 받아 형식 바꿔 출력하기(설명)
 * 년월일을 출력하는 방법은 나라마다, 형식마다 조금씩 다르다.
 * 년월일(yyyy.mm.dd)를 입력받아,
 * 일월년(dd-mm-yyyy)로 출력해보자.
 * */

import java.util.Scanner;
public class ex1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		String[] arr = date.split("\\.");
		
		int year = Integer.valueOf(arr[0]);
		int month = Integer.valueOf(arr[1]);
		int day = Integer.valueOf(arr[2]);
		
		System.out.printf("%02d-%02d-%04d", day, month, year);
	}

}

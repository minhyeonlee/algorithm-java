/*
 * 1020 : [기초-입출력] 주민번호 입력받아 형태 바꿔 출력하기
 * */

import java.util.Scanner;

public class ex1020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		String[] arr = id.split("-");
		System.out.println(arr[0]+arr[1]);

	}

}

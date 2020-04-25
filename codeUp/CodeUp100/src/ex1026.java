/*
 * 1026 : [기초-입출력] 시분초 입력받아 분만 출력하기(설명)
 * 입력되는 시:분:초 에서 분만 출력해보자.
 * */

import java.util.Scanner;
public class ex1026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		String[] arr = time.split(":");
		
		int min = Integer.valueOf(arr[1]);
		System.out.println(min);
	}

}

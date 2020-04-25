/*
 * 1025 : [기초-입출력] 정수 1개 입력받아 나누어 출력하기(설명)
 * 다섯 자리의 정수 1개를 입력받아 각 자리별로 나누어 출력한다.
 * */

import java.util.Scanner;
public class ex1025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String myNum = sc.nextLine();
		String[] arr = myNum.split("");
		
		for(int i = 0, m = 10000; i < arr.length; i++, m/=10) {
			int x  = Integer.valueOf(arr[i]);
			System.out.println("[" + x * m + "]");
		}
	}

}

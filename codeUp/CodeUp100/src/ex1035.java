/*
 * 1035 : [기초-출력변환] 16진 정수 1개 입력받아 8진수로 출력하기(설명)
 * 16진수로 입력된 정수 1개를 8진수로 바꾸어 출력해보자.
 * */

import java.util.Scanner;

public class ex1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hNum = sc.next();
		
		int num = Integer.parseInt(hNum, 16);
		String oNum = Integer.toOctalString(num);
		System.out.println(oNum);
		
		sc.close();
	
	}

}

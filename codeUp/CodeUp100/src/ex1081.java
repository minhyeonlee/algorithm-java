/*
 * 1081 : [기초-종합] 주사위를 2개 던지면?(설명) 
 * 1부터 n까지, 1부터 m까지 숫자가 적힌
 * 서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.
 * */

import java.util.Scanner;

public class ex1081 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				System.out.println(i + " " + j);
			}
		}
		sc.close();
	}

}

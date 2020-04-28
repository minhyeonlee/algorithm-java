/*
 * 1068 : [기초-조건/선택실행구조] 정수 1개 입력받아 평가 출력하기(설명)
 * 점수(정수, 0 ~ 100)를 입력받아 평가를 출력해보자.
 * 평가 기준
 * 점수 범위 : 평가
 * 90 ~ 100 : A
 * 70 ~   89 : B
 * 40 ~   69 : C
 * 0 ~   39 : D
 * */

import java.util.Scanner;

public class ex1068 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if (score >= 90 & score <= 100) {
			System.out.println("A");
		}
		else if(score >= 70 & score < 90) {
			System.out.println("B");
		}
		else if(score >= 40 & score <70) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
		
		sc.close();
	}

}

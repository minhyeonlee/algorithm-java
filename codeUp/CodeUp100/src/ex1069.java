/*
 * 1069 : [기초-조건/선택실행구조] 평가 입력받아 다르게 출력하기(설명)
 * 평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.
 * 평가 내용
 * 평가 : 내용
 * A : best!!!
 * B : good!!
 * C : run!
 * D : slowly~
 * 나머지 문자들 : what?
 * */

import java.util.Scanner;

public class ex1069 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char grade = sc.next().charAt(0);

		if (grade == 'A') {
			System.out.println("best!!!");
		} 
		else if (grade == 'B') {
			System.out.println("good!!");
		} 
		else if (grade == 'C') {
			System.out.println("run!");
		} 
		else if (grade == 'D') {
			System.out.println("slowly~");
		} 
		else {
			System.out.println("what?");
		}

		sc.close();
	}

}

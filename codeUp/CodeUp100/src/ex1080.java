/*
 * 1080 : [기초-종합] 언제까지 더해야 할까?
 * 1, 2, 3 ... 을 계속 더해 나갈 때,
 * 그 합이 입력한 정수(0 ~ 1000)보다 같거나 작을 때까지
 * 계속 더하는 프로그램을 작성해보자.
 * */

import java.util.Scanner;

public class ex1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum = 0;
		int i = 0;
		while (true) {
			sum += i;
			if (sum >= num) {
				System.out.println(i);
				break;
			}

			i += 1;
		}
		sc.close();
	}

}

import java.util.Scanner;

/*
 * 1089 : [기초-종합] 수 나열하기1 
 * 시작 값(a), 등차(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때
 * n번째 수를 출력하는 프로그램을 만들어보자.
 */
public class ex1089 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();

		int result = a;

		for (int i = 1; i < n; i++) {
			result += d;
		}

		System.out.println(result);

	}
}

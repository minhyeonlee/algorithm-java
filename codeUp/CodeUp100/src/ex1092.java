import java.util.Scanner;

/*
 * 1092 : [기초-종합] 함께 문제 푸는 날(설명)
 * 같은 날 동시에 가입한 3명의 사람들이 온라인 채점시스템에 들어와 문제를 푸는 날짜가
 * 매우 규칙적이라고 할 때, 다시 모두 함께 문제를 풀게 되는 그날은 언제일까?
 */
public class ex1092 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		int day = 1;
		while (day % a != 0 | day % b != 0 | day % c != 0) {
			day++;
		}

		System.out.println(day);

	}
}

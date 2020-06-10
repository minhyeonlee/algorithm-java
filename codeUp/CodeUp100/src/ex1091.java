import java.util.Scanner;

/*
 * 1091 : [기초-종합] 수 나열하기3
 * 시작 값(a), 곱할 값(m), 더할 값(d), 몇 번째인지를 나타내는 정수(n)가 입력될 때,
 * n번째 수를 출력하는 프로그램을 만들어보자.
 */
public class ex1091 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();

        long result = a;

        for (int i = 1; i < n; i++) {
        	result = result * m;
            result = result + d;
        }

        System.out.println(result);

    }
}


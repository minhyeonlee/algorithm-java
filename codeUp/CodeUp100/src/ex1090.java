import java.util.Scanner;

/*
 * 1090 : [기초-종합] 수 나열하기2
 * 시작 값(a), 등비(r), 몇 번째인지를 나타내는 정수(n)가 입력될 때
 * n번째 수를 출력하는 프로그램을 만들어보자.
 */
public class ex1090 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long r = scanner.nextLong();
        long n = scanner.nextLong();

        long result = a;

        for (int i = 1; i < n; i++) {
            result *= r;
        }

        System.out.println(result);

    }
}

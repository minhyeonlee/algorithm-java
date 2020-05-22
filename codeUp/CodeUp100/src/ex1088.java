import java.util.Scanner;

/*
 * 1088 : [기초-종합] 3의 배수는 통과?(설명)
 * 1부터 입력한 정수까지 1씩 증가시켜 출력하는 프로그램을 작성하되,
 * 3의 배수인 경우는 출력하지 않도록 만들어보자.
 */
public class ex1088 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			if (i % 3 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}

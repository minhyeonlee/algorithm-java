import java.util.Scanner;

/*
 * 1093 : [기초-1차원배열] 이상한 출석 번호 부르기1(설명) 
 * 출석 번호를 n번 무작위로 불렀을 때, 각 번호(1 ~ 23)가 불린 횟수를 각각 출력해보자.
 */
public class ex1093 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int size = scanner.nextInt();
		int[] callArray = new int[size];
		int[] placeArray = new int[23];

		for (int i = 0; i < callArray.length; i++) {
			callArray[i] = scanner.nextInt();
		}

		for (int i = 0; i < placeArray.length; i++) {
			placeArray[i] = 0;
		}
		for (int call : callArray) {
			placeArray[call - 1]++;
		}

		for (int place : placeArray) {
			System.out.print(place + " ");

		}

	}
}

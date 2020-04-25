/*
 * 1023 : [기초-입출력] 실수 1개 입력받아 부분별로 출력하기(설명)
 * 실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.
 * */
import java.util.Scanner;

public class ex1023 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		String[] arr = num.split("\\.");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
	}

}

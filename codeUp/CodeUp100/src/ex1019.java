/*
 * 1019 : [기초-입출력] 연월일 입력받아 그대로 출력하기
 * 입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다.
 * (%02d를 사용하면 2칸을 사용해 출력하는데, 한 자리 수인 경우 앞에 0을 붙여 출력한다.)
 * */
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex1019 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		String[] arr = date.split("\\.");
		
		int year = Integer.valueOf(arr[0]);
		int month = Integer.valueOf(arr[1]);
		int day = Integer.valueOf(arr[2]);
		
		System.out.printf("%04d.%02d.%02d",year, month, day );

	}

}

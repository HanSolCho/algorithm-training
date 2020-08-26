package greedyalgorithm;

import java.util.Scanner;

public class Change {
	// 백준 알고리즘(5585)
	public static void main(String[] args) {

		//int N = 620; // 1000 - X가 N이되게끔해야함
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int N = 1000-price;
		// 500엔 -> 100엔 -> 50엔 -> 10엔 -> 5엔 -> 1엔 순서로 몫 나머지 이용하면됨.
		int answer = 0;

		if (N / 500 > 0) {
			// N값이 500보다 클 경우 정답에 몫을 더해주고 N값은 나머지값으로 변화
			answer += N / 500;
			N = N % 500;
		}
		// 여기서부터 N값은 무조건 500보다 작다.
		if (N / 100 > 0) {
			// N값이 100보다 클 경우 진입
			answer += N / 100;
			N = N % 100;
		}
		if (N / 50 > 0) {
			// N값이 50보다 클 경우 진입
			answer += N / 50;
			N = N % 50;
		}
		if (N / 10 > 0) {
			// N값이 10보다 클 경우 진입
			answer += N / 10;
			N = N % 10;
		}
		if (N / 5 > 0) {
			// N값이 5보다 클 경우 진입
			answer += N / 5;
			N = N % 5;
		}
		if (N / 1 > 0) {
			// N값이 1보다 클 경우 진입
			answer += N / 1;
			N = N % 1;
		}
		System.out.println(answer);

	}
}
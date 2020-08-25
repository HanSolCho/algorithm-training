package greedyalgorithm;

import java.util.Scanner;

public class sugar {
	// 백준 설탕문제(2839) 그리디알고리즘
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = 0;
		int five_q, five_l, three_q, three_l; // 5,3으로 나눈 나머지 및 몫
		int f_t_q, f_t_l; // 5로 나눈후 나머지를 3으로 나눈 몫 및 나머지

		five_q = N / 5;
		five_l = N % 5;

		while (true) {

			if (five_l == 0) {
				// 5로 나누어떨어지면 끝.
				answer = five_q;
				break;
			} else {
				// 5로 나눈 나머지가 3으로 나누어 떨어지면 끝 OR 안떨어지면 5의 몫을 줄여가면서 처음부터 다시 진행
				f_t_q = five_l / 3; // ((N%5)/3)
				f_t_l = five_l % 3; // ((N%5)%3)
				if (f_t_l == 0) {
					answer = five_q + f_t_q;
					break;
				} else {
					// 몫의 1이하이고 나머지가 0이 아니라면 5와 3으로 분류 할수없음.
					// 몫을 하나 줄이고 그만큼 나머지를 늘려줘서 다시 진행
					if (five_q < 1 && f_t_l != 0) {
						answer = -1;
						break;
					}
					five_q = five_q - 1;
					five_l = five_l + 5;
				}
			}
		}
		System.out.print(answer);

	}
}

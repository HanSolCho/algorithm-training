package greedyalgorithm;

import java.util.Scanner;

public class Change {
	// ���� �˰���(5585)
	public static void main(String[] args) {

		//int N = 620; // 1000 - X�� N�̵ǰԲ��ؾ���
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int N = 1000-price;
		// 500�� -> 100�� -> 50�� -> 10�� -> 5�� -> 1�� ������ �� ������ �̿��ϸ��.
		int answer = 0;

		if (N / 500 > 0) {
			// N���� 500���� Ŭ ��� ���信 ���� �����ְ� N���� ������������ ��ȭ
			answer += N / 500;
			N = N % 500;
		}
		// ���⼭���� N���� ������ 500���� �۴�.
		if (N / 100 > 0) {
			// N���� 100���� Ŭ ��� ����
			answer += N / 100;
			N = N % 100;
		}
		if (N / 50 > 0) {
			// N���� 50���� Ŭ ��� ����
			answer += N / 50;
			N = N % 50;
		}
		if (N / 10 > 0) {
			// N���� 10���� Ŭ ��� ����
			answer += N / 10;
			N = N % 10;
		}
		if (N / 5 > 0) {
			// N���� 5���� Ŭ ��� ����
			answer += N / 5;
			N = N % 5;
		}
		if (N / 1 > 0) {
			// N���� 1���� Ŭ ��� ����
			answer += N / 1;
			N = N % 1;
		}
		System.out.println(answer);

	}
}
package greedy;

import java.util.Scanner;

public class sugar {
	// ���� ��������(2839) �׸���˰���
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = 0;
		int five_q, five_l, three_q, three_l; // 5,3���� ���� ������ �� ��
		int f_t_q, f_t_l; // 5�� ������ �������� 3���� ���� �� �� ������

		five_q = N / 5;
		five_l = N % 5;

		while (true) {

			if (five_l == 0) {
				// 5�� ����������� ��.
				answer = five_q;
				break;
			} else {
				// 5�� ���� �������� 3���� ������ �������� �� OR �ȶ������� 5�� ���� �ٿ����鼭 ó������ �ٽ� ����
				f_t_q = five_l / 3; // ((N%5)/3)
				f_t_l = five_l % 3; // ((N%5)%3)
				if (f_t_l == 0) {
					answer = five_q + f_t_q;
					break;
				} else {
					// ���� 1�����̰� �������� 0�� �ƴ϶�� 5�� 3���� �з� �Ҽ�����.
					// ���� �ϳ� ���̰� �׸�ŭ �������� �÷��༭ �ٽ� ����
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

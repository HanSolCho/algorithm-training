package greedyalgorithm;

import java.util.Scanner;

public class wrong_rope {
	//���� �˰���(2217)
		public static void main(String[] args) {
			// �־��� ������ �� ���� ���� �߷��� ��ƿ�� �ִ� ������ ���� * ������ ����
			// ���� ���ǿ� ��� ������ ����� �ʿ�� ���ٴ� ������ Ȯ������ ����!!
			//int N = 2;
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int W[] = new int[N];
			int answer =0;
			for(int i=0;i<W.length;i++) {
				W[i] = sc.nextInt();
			}
			
			for(int i=1;i<W.length;i++) {
				if(W[i]>W[i-1]) {
					W[i] = W[i-1];
				}	
			}
			answer = W[W.length-1]*N;
			System.out.print(answer);
		}
}

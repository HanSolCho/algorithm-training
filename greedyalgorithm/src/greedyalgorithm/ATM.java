package greedyalgorithm;

import java.util.Scanner;

public class ATM {
	//���� �˰���(11399)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//int P[] = {3,1,4,3,2};
		int P[] = new int[N];
		int temp =0;
		int answer =0;
		
		for (int i = 0; i < N; i++) {
			P[i] = sc.nextInt();
		}
		
		// ã�ƺ��� Arrays.sort �� �̿��ϸ� ������ �����ϰ� �ذ��� �� �ִ�.
		//<----------------�������
		for(int i=0;i<P.length;i++) {
			for(int j=i+1;j<P.length;j++) {
				//S�迭�� ũ�⸸ŭ �ݺ� ��Ű�鼭 pi�� ���� pj���� ���Ѵ�
				//pj���� �� ū��쿣 �ڸ��� �ٲ� �ʿ䰡 ����.
				//pi���� �� Ŭ ��쿣 temp�� �ӽ÷� �����ߴٰ� pj�� pi�� temp�� pj�� �־��ش�.
				// i=0,j=1 / i=0,j=2 /
				if(P[i]>P[j]) {
					temp = P[i];
					P[i] = P[j];
					P[j] = temp;
					temp = 0;
				}	
			}
		}
		//--------------------------<��������� �ڵ尡 Arrays.sort(P);�� ��ü�� �� �ִ�.
		//���� ���������̶�� Arrays.sort(P, Collections.reverseOrder());�� ��ü �����ϴ�.
		//������ �����⿡ ���ϱ� ���길�ϸ�ȴ�.
		for(int i=0;i<P.length;i++) {
			for(int j=0;j<i+1;j++) {
				//j�� 0���� i��°��ŭ �����ذ��� ���信 ��� �����ش�.
				temp += P[j];
			}
			answer += temp;
			temp = 0;
		}
		System.out.print(answer);
	}
}

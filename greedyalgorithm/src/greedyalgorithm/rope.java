package greedyalgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class rope {
	//���� �˰���(2217)
	public static void main(String[] args) {
		//int N = 2;
		//int W[] = {10,15};
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //����
		int W[] = new int[N]; // �� ����
		for(int i=0;i<W.length;i++) {
			W[i] = sc.nextInt();
		}
		int H_W[] = new int[N]; //�ߵ��� �ִ� ����
		int answer = 0;
		
		// �� ���� �������� ���� ��
		Arrays.sort(W);
		
		for(int i=0;i<W.length;i++) {
			H_W[i] = W[i]*(N-i); //��� ������ �پ������� ���ʷ� ���� �ٿ����鼭 ���
			//������������ �����߱⶧���� �����ҵ�
		}
		
		Arrays.sort(H_W); // ����� ����
		answer = H_W[H_W.length-1];
		System.out.print(answer);
	}
}

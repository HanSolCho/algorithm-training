package greedyalgorithm;

import java.util.Scanner;

public class Coin0 {
	//���� �˰���(11047)
	public static void main(String[] args) {
		//int N = 10; // ���� ����
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//int K = 4790; // ��ǥ��
		int K = sc.nextInt();
		//int A[] = {1,5,10,50,100,500,1000,5000,10000,50000}; 
		int A[] = new int[N];
		for(int i=0;i<A.length;i++) {
			A[i] = sc.nextInt();
		}
		int index =0;
		int cnt = 0;
		int answer=0;
		
		//A�� �ݺ��ؼ� ���鼭 K���� ū ���� ������ ��ġ�� ã�´�.
		//���������̱⿡ ã�� ��ġ���� ���� ��ġ�� ������ ����� �� �ִ�.
		//���� ����� ��ġ������ ���ʷ� �������鼭 ����ϵ��� �Ѵ�.
		for(int i =0;i<A.length;i++) {
			if(K<A[i]) {
				//K���� ū �� A[i]�� �����ԵǸ� ����
				//k���� ū ������ �ϳ� ���� ���� ��ġ�� ������ ����
				index = i-1;
			//	System.out.println("��ġ��"+index);
				break;
			}
			//�̶� A[i]�� ���߿� K���� ū ��찡 �ϳ��� ���� ����� ����ó���� �ʿ���.
			else {
				cnt += 1;
				if(cnt == A.length) {
					index = A.length-1;
				}
			}
			
		}
		while(true) {
			//System.out.println("��ġ�� ��"+A[index]);
			//ū������ ���ʷ� ����������.
			if(K%(A[index])==0) {
				//��Ȯ�� ������ �������� ���
				answer += K/A[index];
				break;
			}
			else {
				//ū������ ������ �������� �ʴ� ���.
				//A[index]�� ���� ��ŭ ������ üũ�ص�
				answer += K/A[index];
				//K������ A[index]�� ���� ��ŭ ���� �������
				K -= A[index]*(K/A[index]);
				//index��ġ�� �ϳ� ������ ���ܼ� �ݺ��ؾ���
				index -= 1;
				//������ ��ġ�� ������� ��������
				if(index == -1) {
					break;
				}
			}
		}
		System.out.println(answer);
		
	}
}

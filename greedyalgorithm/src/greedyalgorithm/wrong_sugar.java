package greedyalgorithm;

public class wrong_sugar {
	//�߸� �ذ��� ��������(����2839)
	//�ܼ��� ��� �������� �ƴ϶� 5�� ���� �ٿ����鼭 ����߾����.
	public static void main(String[] args) {
		//N���� 5 Ȥ�� 3���� ������ �ּ� ������ ������ ����
		//5�� ���� ������ ������ �������� �� �ȵɰ�� 3���� �غ���
		int N = 11;
		int answer =0;
		int five_q,five_l,three_q,three_l; //5,3���� ���� ������ �� ��
		int f_t_q,f_t_l; // 5�� ������ �������� 3���� ���� �� �� ������
		
		five_q = N/5;
		five_l = N%5;
		three_q = N/3;
		three_l = N%3;
		
		if(five_l!=0) {
			//5�γ������� ������ ����
			
			if(five_l%3==0) {
				f_t_q = five_l/3; // (N%5)/3
				f_t_l = five_l%3; // (N%5)%3
				//5�� ���� ������ ���� 3���� ���������� 0�̵Ǵ� ���
				answer = five_q + f_t_q;
			}
			else {
				//5�� 3���� ������ �ʴ� ���
				//3���θ� ������ ����ϵ�
				answer = three_q;
				if(three_l!=0) {
					answer = -1;
				}
			}
		}
		else {
			//5�� �������� ������ ����. �� 5�� ������ ��ü�� �ּҰ���
			answer = N/5;
		}
		
		System.out.print(answer);
		
	}
}

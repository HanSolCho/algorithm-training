import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// baekjoon num 15953 
// īī�� �ڵ��佺Ƽ�� 2018 ���� A �������
// �������´�� Ǯ����̶� �ڵ尡 ������ �� ������.. �ٸ� ���� Ǯ��� �������� ��ġ��
public class price_hunter {
	public static void main(String[] args) {

		int T = 0; // 1<=T<=1000 Ƚ��
		int a =0;  // 0<=a<=100 ���
		int b =0; // 0<=b<=64 ���
		int a_price,b_price; // ��� ���� ����
		List<Integer> t_price = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);

		while (T < 1 || T > 1000) {
			//System.out.print("�׽�Ʈ�� Ƚ���� �Է��ϼ���(0<T<1001)");
			T = sc.nextInt();
		}

		for (int i = 0; i < T; i++) {
			a = sc.nextInt(); // 1�� ��ȸ�� ��� �Է�
			b = sc.nextInt(); // 2�� ��ȸ�� ��� �Է�
			// a�� ����� ��� ���
			if (a == 1) { // 1��
				a_price = 5000000;
			} else if (2 <= a && a <= 3) { // 2��
				a_price = 3000000;
			} else if (4 <= a && a <= 6) { // 3��
				a_price = 2000000;
			} else if (7 <= a && a <= 10) { // 4��
				a_price = 500000;
			} else if (11 <= a && a <= 15) { // 5��
				a_price = 300000;
			} else if (16 <= a && a <= 21) { // 6��
				a_price = 100000;
			} else { //���
				a_price = 0;
			}
			// b�� ����� ��� ���
			if(b==1) { //1��
				b_price = 5120000;
			}else if(2<=b && b <=3) { //2��
				b_price = 2560000;
			}else if(4<=b && b <=7) { //3��
				b_price = 1280000;
			}else if(8<=b && b <=15) { //4��
				b_price = 640000;
			}else if(16<=b && b <=31) { //5��
				b_price = 320000;
			}else {
				b_price = 0;
			}
			 t_price.add(a_price+b_price);

		}
		for(int i=0;i<t_price.size();i++) {
			System.out.println(t_price.get(i));
		}

	}
}

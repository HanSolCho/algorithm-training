
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UnderX {

	// �ڵ�� �����۵��ϴ°� ������ ���ؿ��� Ʋ�ȴٰ� ���� ������ ã�ƺ���...
	// ���ô�� 10�� �����߿� 5���� ������ ���� ��� ����� �� ������ ���� ���ѷ��� ��������
	//���µ� �װͶ����ΰ� ���⵵��. ���ڰ� ũ�� �۵��� �Ѵ�.
	
	//ã�ƺ��� �迭�� ���� ���� ���� �Է��ϴ°Ͱ���..... �� �̴�� ������!!
	public static void main(String[] arg) {
		int N, X;
		List<Integer> A = new ArrayList<Integer>();
		List<String> B = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		if (N < 1 || N > 10000) {
			N = sc.nextInt();
		}
		X = sc.nextInt();
		if (X < 1 || X > 10000) {
			X = sc.nextInt();
		}
		
		while (!B.contains("O")){
			for (int i = 0; i < N; i++) {
				double rd = Math.random();
				int intrd = (int) (rd * 10000) + 1;
				A.add(intrd);
				if (A.get(i) < X) {
					B.add("O");
				} else {
					B.add("X");
				}
			}
			
		}

		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) < X) {
				System.out.print(A.get(i) + " ");

			} 
		}
	}

}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class binary {
	public static void main(String[] args) {

		int n;
		int fa =0;
		String bs;
		String[] sbs;
		int lineCnt=0;
		List<Integer> Count = new ArrayList<Integer>();
	    int fromIndex = -1;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		bs = Integer.toBinaryString(n);
		
		sbs = bs.split("1");
		
		
		
		//���̵��! -> ������ 1��1���̰��� �ƴϸ� �� ���ǹ� �� ������1������ 0���� 1�� ��ü���Ѻ���
		//������ 1�� �ε������� ã�Ƽ�( 1�� �ε����� �� ã�Ƽ� ���� ū�� ����ǰ���
		//�� �ε��������� ū �迭������ ���� 1�� ����
		for(int i=0;i<sbs.length;i++) {
			//1�� �ε��� ��ġ�� ������ �迭 ����
		}
		//�ٽ� �������� ��� ���� ������ 1�� �ƽ� �ε����� ã�� 
		//���ο� ���������� 1�� �ƽ� �ε��� ������ ū��� �� �ϴ� ����
		
		
		
		for(int i=0;i<sbs.length;i++) {
		
			
		//�ּ� ����
			// indexof("ã�� ����",��𼭺���ã������->ã���� �����ڸ��� ��ġ���� ã������+1���ִ°�)
			// >=0�� ��� indexof �Լ� ������� ������ -1�� ��ȯ�ϱ⶧�� �� ���ӵ� ���ڰ� ������ �ǹ���
		    while ((fromIndex = sbs[i].indexOf("0", fromIndex + 1)) >= 0) {
		      lineCnt++;
		    }
			Count.add(lineCnt);
			lineCnt =0;
			System.out.println("s����");
			 System.out.println(sbs.length);
		    System.out.println(sbs[i]);
		    System.out.println(Count.get(i));
		}
		 
		System.out.println("����");
		System.out.println(Count.size());
		Count.add(1);
		
		for(int i=0;i<Count.size();i++) {		
			if(fa>=Count.get(i)) {
					
			}
			else {
				fa = Count.get(i);
			}
			
		}
		
		
		
		System.out.println(fa);
	}
}
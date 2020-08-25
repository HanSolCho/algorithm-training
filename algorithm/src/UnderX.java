
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UnderX {

	// 코드는 정상작동하는것 같은데 백준에서 틀렸다고 나옴 이유를 찾아보자...
	// 예시대로 10개 숫자중에 5보다 작은것 같은 경우 경우의 수 때문에 거의 무한루프 수준으로
	//도는데 그것때문인것 같기도함. 숫자가 크면 작동은 한다.
	
	//찾아보니 배열에 들어가는 수를 직접 입력하는것같다..... 난 이대로 마무리!!
	// 알고리즘 문제들을 보면 숫자를 미리 정해주고 하는것인지 후에 랜덤으로 주는것인지 헷갈리는경우가 있는데 그런 케이스로 문제 이해를 잘못한 경우
	// 나중에 코드를 다시본다면 저 부분을 고치기보다 숫자가 커지더라도 잘 구현되도록 수정해보자
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

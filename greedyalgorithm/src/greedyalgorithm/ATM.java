package greedyalgorithm;

import java.util.Scanner;

public class ATM {
	//백준 알고리즘(11399)
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
		
		// 찾아보니 Arrays.sort 를 이용하면 정렬은 간단하게 해결할 수 있다.
		//<----------------여기부터
		for(int i=0;i<P.length;i++) {
			for(int j=i+1;j<P.length;j++) {
				//S배열의 크기만큼 반복 시키면서 pi의 값과 pj값을 비교한다
				//pj값이 더 큰경우엔 자리를 바꿀 필요가 없다.
				//pi값이 더 클 경우엔 temp에 임시로 저장했다가 pj을 pi로 temp를 pj로 넣어준다.
				// i=0,j=1 / i=0,j=2 /
				if(P[i]>P[j]) {
					temp = P[i];
					P[i] = P[j];
					P[j] = temp;
					temp = 0;
				}	
			}
		}
		//--------------------------<여기까지의 코드가 Arrays.sort(P);로 대체할 수 있다.
		//만약 내림차순이라면 Arrays.sort(P, Collections.reverseOrder());로 대체 가능하다.
		//정렬이 끝났기에 더하기 연산만하면된다.
		for(int i=0;i<P.length;i++) {
			for(int j=0;j<i+1;j++) {
				//j가 0부터 i번째만큼 더해준값을 정답에 계속 더해준다.
				temp += P[j];
			}
			answer += temp;
			temp = 0;
		}
		System.out.print(answer);
	}
}

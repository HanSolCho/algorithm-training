package greedyalgorithm;

import java.util.Scanner;

public class wrong_rope {
	//백준 알고리즘(2217)
		public static void main(String[] args) {
			// 주어진 로프들 중 가장 적은 중량을 버틸수 있는 로프의 무게 * 로프의 개수
			// 문제 조건에 모든 로프를 사용할 필요는 없다는 조건을 확인하지 못함!!
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

package greedyalgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class rope {
	//백준 알고리즘(2217)
	public static void main(String[] args) {
		//int N = 2;
		//int W[] = {10,15};
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //개수
		int W[] = new int[N]; // 각 무게
		for(int i=0;i<W.length;i++) {
			W[i] = sc.nextInt();
		}
		int H_W[] = new int[N]; //견딜수 있는 무게
		int answer = 0;
		
		// 각 무게 오름차순 정렬 끝
		Arrays.sort(W);
		
		for(int i=0;i<W.length;i++) {
			H_W[i] = W[i]*(N-i); //모든 로프를 다쓸때부터 차례로 숫자 줄여가면서 계산
			//오름차순으로 정렬했기때문에 가능할듯
		}
		
		Arrays.sort(H_W); // 결과값 정렬
		answer = H_W[H_W.length-1];
		System.out.print(answer);
	}
}

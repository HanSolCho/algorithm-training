package greedyalgorithm;

import java.util.Scanner;

public class Coin0 {
	//백준 알고리즘(11047)
	public static void main(String[] args) {
		//int N = 10; // 동전 종류
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//int K = 4790; // 목표값
		int K = sc.nextInt();
		//int A[] = {1,5,10,50,100,500,1000,5000,10000,50000}; 
		int A[] = new int[N];
		for(int i=0;i<A.length;i++) {
			A[i] = sc.nextInt();
		}
		int index =0;
		int cnt = 0;
		int answer=0;
		
		//A를 반복해서 돌면서 K보다 큰 수가 나오는 위치를 찾는다.
		//오름차순이기에 찾은 위치보다 앞의 위치의 값으로 계산할 수 있다.
		//가장 가까운 위치값부터 차례로 내려가면서 계산하도록 한다.
		for(int i =0;i<A.length;i++) {
			if(K<A[i]) {
				//K보다 큰 값 A[i]를 만나게되면 멈춤
				//k보다 큰 값보다 하나 작은 값의 위치를 가지고 가자
				index = i-1;
			//	System.out.println("위치값"+index);
				break;
			}
			//이때 A[i]의 값중에 K보다 큰 경우가 하나도 없을 경우의 예외처리가 필요함.
			else {
				cnt += 1;
				if(cnt == A.length) {
					index = A.length-1;
				}
			}
			
		}
		while(true) {
			//System.out.println("위치의 값"+A[index]);
			//큰값부터 차례로 나눠나가자.
			if(K%(A[index])==0) {
				//정확히 나누어 떨어지는 경우
				answer += K/A[index];
				break;
			}
			else {
				//큰값으로 나누어 떨어지지 않는 경우.
				//A[index]의 개수 만큼 갯수를 체크해둠
				answer += K/A[index];
				//K값에서 A[index]의 개수 만큼 값을 빼줘야함
				K -= A[index]*(K/A[index]);
				//index위치를 하나 앞으로 땡겨서 반복해야함
				index -= 1;
				//마지막 위치를 지날경우 끝내야함
				if(index == -1) {
					break;
				}
			}
		}
		System.out.println(answer);
		
	}
}

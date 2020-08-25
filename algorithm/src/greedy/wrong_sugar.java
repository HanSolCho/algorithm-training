package greedy;

public class wrong_sugar {
	//잘못 해결한 설탕문제(백준2839)
	//단순히 몫과 나머지가 아니라 5의 몫을 줄여가면서 계산했어야함.
	public static void main(String[] args) {
		//N값을 5 혹은 3으로 나눠서 최소 개수로 나누는 문제
		//5로 먼저 나눠서 나누어 떨어지면 끝 안될경우 3으로 해보기
		int N = 11;
		int answer =0;
		int five_q,five_l,three_q,three_l; //5,3으로 나눈 나머지 및 몫
		int f_t_q,f_t_l; // 5로 나눈후 나머지를 3으로 나눈 몫 및 나머지
		
		five_q = N/5;
		five_l = N%5;
		three_q = N/3;
		three_l = N%3;
		
		if(five_l!=0) {
			//5로나눴을때 나머지 존재
			
			if(five_l%3==0) {
				f_t_q = five_l/3; // (N%5)/3
				f_t_l = five_l%3; // (N%5)%3
				//5로 나눈 나머지 값을 3으로 나누었을때 0이되는 경우
				answer = five_q + f_t_q;
			}
			else {
				//5와 3으로 나뉘지 않는 경우
				//3으로만 나뉘는 경우일듯
				answer = three_q;
				if(three_l!=0) {
					answer = -1;
				}
			}
		}
		else {
			//5로 나눴을때 나머지 없다. 즉 5로 나눈값 자체가 최소개수
			answer = N/5;
		}
		
		System.out.print(answer);
		
	}
}

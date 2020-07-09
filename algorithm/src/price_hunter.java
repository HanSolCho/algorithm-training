import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// baekjoon num 15953 
// 카카오 코드페스티벌 2018 예선 A 상금헌터
// 생각나는대로 풀어본것이라 코드가 복잡할 수 있으나.. 다른 문제 풀어보고 생각나면 고치자
public class price_hunter {
	public static void main(String[] args) {

		int T = 0; // 1<=T<=1000 횟수
		int a =0;  // 0<=a<=100 등수
		int b =0; // 0<=b<=64 등수
		int a_price,b_price; // 상금 변수 선언
		List<Integer> t_price = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);

		while (T < 1 || T > 1000) {
			//System.out.print("테스트할 횟수를 입력하세요(0<T<1001)");
			T = sc.nextInt();
		}

		for (int i = 0; i < T; i++) {
			a = sc.nextInt(); // 1번 대회의 등수 입력
			b = sc.nextInt(); // 2번 대회의 등수 입력
			// a의 등수별 상금 기록
			if (a == 1) { // 1등
				a_price = 5000000;
			} else if (2 <= a && a <= 3) { // 2등
				a_price = 3000000;
			} else if (4 <= a && a <= 6) { // 3등
				a_price = 2000000;
			} else if (7 <= a && a <= 10) { // 4등
				a_price = 500000;
			} else if (11 <= a && a <= 15) { // 5등
				a_price = 300000;
			} else if (16 <= a && a <= 21) { // 6등
				a_price = 100000;
			} else { //등외
				a_price = 0;
			}
			// b의 등수별 상금 기록
			if(b==1) { //1등
				b_price = 5120000;
			}else if(2<=b && b <=3) { //2등
				b_price = 2560000;
			}else if(4<=b && b <=7) { //3등
				b_price = 1280000;
			}else if(8<=b && b <=15) { //4등
				b_price = 640000;
			}else if(16<=b && b <=31) { //5등
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

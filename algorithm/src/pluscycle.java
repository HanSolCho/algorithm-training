import java.util.Scanner;
// 주석을 안달아놔서 어디서 푼 문제인지는 모름
// a값을 특정 규칙으로 나눠서 나온 나머지를 더하는 방식으로 아마 나머지+십의자리수 이런식이었던거 같음
// 그 값이 다시  a값과 동일할때까지 카운트 세는것
public class pluscycle {
	public static void main(String[] args) {
		int count;
		int N,a;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		a = N;
		count = 0;
		while (true) {
			count++;
			a = ((a % 10) * 10) + (((a / 10) + (a % 10)) % 10);
			if (N == a)
				break;
		}
		System.out.print(count);

	}
}

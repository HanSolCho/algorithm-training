import java.util.Scanner;

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
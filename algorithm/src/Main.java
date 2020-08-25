
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		List<Integer> A = new ArrayList<Integer>();
		List<Integer> Sol = new ArrayList<Integer>();
		int F,M;
		int FA = 0;
		int N;
		int sumA=0;
		
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		for(int i=0;i<N;i++) {
			A.add(sc.nextInt());
		}
		
		F = sc.nextInt();
		M = sc.nextInt();
		
		for(int i=0;i<A.size();i++) {
			sumA = sumA + A.get(i);
		}
		
		if(F*1>M*(F+N)-sumA || F*6>M*(F+N)-sumA) {
			System.out.print("0"); // return 0;
		}
		
		else {
			int q =M*(F+N)-sumA;			
			while(q!=0) {
			
				for(int i=0;i<F;i++) {
					if(q>=1&&q<=6) {
					Sol.add(q);
					q= q-q;
					System.out.print("if");
					}
					else {
					FA = ((int)(Math.random()*6)+1);
					Sol.add(FA);
					System.out.print("else");
					q = q-FA;
					}
				}
				
				
			}
			
			for(int i=0;i<Sol.size();i++) {
				System.out.print(Sol.get(i));
			}
		}
	
		
	}
}





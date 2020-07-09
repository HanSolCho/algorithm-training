import java.util.Scanner;

public class 마름모 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n;
			Scanner sc = new Scanner(System.in);
			System.out.println("크기 = (2xn+1,2xn+1)행렬");
			System.out.println("자연수  n값을 입력하시오.");
			n = sc.nextInt();
			
			String 마름모[][]= new String[n+1][2*n+1];
			
			for(int j=0; j<=n; j=j+1) {
				for(int i=0; i<=2*n; i=i+1) {
					if(n-i<=j&&n>=i) {
						마름모[j][i]=" O ";
					}
					else if(n<i) {
						for(int k = 1;k<=n;k=k+1) {
							마름모[j][n+k]=마름모[j][n-k];
						}	
					}
					else {
						마름모[j][i]="   ";
					}
				}
			}
			for(int j=0; j<=n; j=j+1) {
				for(int i=0; i<=2*n; i=i+1) {
					if(j<=n) {
					System.out.print(마름모[j][i]);
					}
					
					
				}
				System.out.println();
			}
				for(int k=1;k<=n;k=k+1) {
					for(int i=0; i<=2*n; i=i+1) {
					System.out.print(마름모[n-k][i]);
			}
					System.out.println();
			}
			
	}

}

import java.util.Scanner;

public class ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n;
			Scanner sc = new Scanner(System.in);
			System.out.println("ũ�� = (2xn+1,2xn+1)���");
			System.out.println("�ڿ���  n���� �Է��Ͻÿ�.");
			n = sc.nextInt();
			
			String ������[][]= new String[n+1][2*n+1];
			
			for(int j=0; j<=n; j=j+1) {
				for(int i=0; i<=2*n; i=i+1) {
					if(n-i<=j&&n>=i) {
						������[j][i]=" O ";
					}
					else if(n<i) {
						for(int k = 1;k<=n;k=k+1) {
							������[j][n+k]=������[j][n-k];
						}	
					}
					else {
						������[j][i]="   ";
					}
				}
			}
			for(int j=0; j<=n; j=j+1) {
				for(int i=0; i<=2*n; i=i+1) {
					if(j<=n) {
					System.out.print(������[j][i]);
					}
					
					
				}
				System.out.println();
			}
				for(int k=1;k<=n;k=k+1) {
					for(int i=0; i<=2*n; i=i+1) {
					System.out.print(������[n-k][i]);
			}
					System.out.println();
			}
			
	}

}

import java.util.Scanner;
//크기에 맞춰서 비율 맞출수 있게 해야할듯
public class 원6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("크기는 (2n+2,2n+2)");
		System.out.println("n값을 입력하시오");
		n= sc.nextInt();
		
		String circle[][] = new String[n+2][2*n+4];
		
		for(int j=0; j<n+2;j=j+1) {
			for(int i=0; i<n+2;i=i+1) {
				if((i-(n+2))*(i-(n+2))+(j-(n+2))*(j-(n+2))>=(n+2)*(n+2)){
					circle[j][i]="  ";
				
				}
				else {
					circle[j][i]=" O";
				}
			
			}
		}
		for(int j=0; j<n+2;j=j+1) {
			for(int i=0; i<n+2;i=i+1) {
				for(int k=0;k<n+2;k=k+1) {
					circle[j][2*n+3-k]=circle[j][k];
				}
			}
		}
		
		
		
		for(int j=0; j<n+2;j=j+1) {
			for(int i=0; i<2*n+4;i=i+1) {
				System.out.print(circle[j][i]);
			}
			System.out.println();
		}
		for(int j=n; j>=0;j=j-1) {
			for(int i=2*n+3; i>=0;i=i-1) {
				System.out.print(circle[j][i]);
			}
			System.out.println();
		}
		
	}

}

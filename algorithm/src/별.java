import java.util.Scanner;

public class �� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		Scanner sc = new Scanner(System.in);
			System.out.println("ũ�� = (7+4(n-1),6+3(n-1))");
			System.out.println("�ڿ��� n���� �Է��ϼ���");
			n= sc.nextInt();
			
			String head[][] = new String[n+1][4*n+3];
			String belly[][]= new String[n+1][4*n+3];
			String tail[][]= new String[n+1][4*n+3];
			for(int j=0;j<=n;j=j+1) {  //�� �Ӹ� ����
				for(int i=0;i<=4*n+2;i=i+1) {
					if(2*n+1-i<=j && 2*n+1>=i) {
						head[j][i]=" O ";  
					}
					else if(2*n+1<i) {
						for(int k=1;k<=2*n+1;k=k+1) {
							if(k<=n) {
							head[j][2*n+1+k]= head[j][2*n+1-k];
							}
							else {
								head[j][i]="   ";
							}
						}
						
					}
					else {
						head[j][i]="   ";
					}
				}
			}// �� �Ӹ� ��
			
			
			for(int j=0; j<=n;j=j+1) { //�� �� ����
				for(int i=0;i<=4*n+2;i=i+1) {
					if(j==0) {
						belly[j][i]=" O ";
						
						
					}
					else {
						
						if(i<j) {
							for(int k=0;k<=j;k=k+1) {
							belly[j][k]="   ";
							}
						}
						else {
							belly[j][i]=" O ";
							for(int k=0;k<=j;k=k+1) {
								belly[j][4*n+2-k]=belly[j][k];
								}
						}
					}
						
						
					}
				} // �� ��
			
			for(int j=0; j<=n;j=j+1) { //��  ���� ����
				for(int i=0;i<=4*n+2;i=i+1) {
						
						if(i<=j) {
							for(int k=0;k<=j+1;k=k+1) {
							tail[j][k]="   ";
							}
						}
						else {
							tail[j][i]=" O ";
							for(int k=0;k<=j;k=k+1) {
								tail[j][4*n+2-k]=tail[j][k]; 
								}
						}
						for(int k=0;k<=n-1;k=k+1) {  //x�� ���� �κ�
							tail[k][2*(n-1)+3]="   ";
							for(int l=1;l<=2*n-2*j-1;l=l+1) {
								tail[k][2*(n-1)+3-l]="   ";
								tail[k][2*(n-1)+3+l]="   ";
							}
							
						}	
						
					
						
						
					}
				} // ���� ��
			
			
			for(int j=0; j<=n; j=j+1) {  //head���
				for(int i=0; i<=4*n+2; i=i+1) {
					if(j<=n) {
					//System.out.print(head[j][i]);
						System.out.print(head[j][i]);
					}
			
				}
				System.out.println();
			}
			for(int j=0; j<=n; j=j+1) { //belly���
				for(int i=0; i<=4*n+2; i=i+1) {
					if(j<=n) {
					//System.out.print(head[j][i]);
						System.out.print(belly[j][i]);
					}
			
				}
				System.out.println();
			}
			for(int j=n; j>=0; j=j-1) { //tail���
				for(int i=0; i<=4*n+2; i=i+1) {
					if(j<=n) {
					//System.out.print(head[j][i]);
						System.out.print(tail[j][i]);
					}
			
				}
				System.out.println();
			}
	}
}
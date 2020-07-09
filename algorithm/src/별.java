import java.util.Scanner;

public class 별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		Scanner sc = new Scanner(System.in);
			System.out.println("크기 = (7+4(n-1),6+3(n-1))");
			System.out.println("자연수 n값을 입력하세요");
			n= sc.nextInt();
			
			String head[][] = new String[n+1][4*n+3];
			String belly[][]= new String[n+1][4*n+3];
			String tail[][]= new String[n+1][4*n+3];
			for(int j=0;j<=n;j=j+1) {  //별 머리 시작
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
			}// 별 머리 끝
			
			
			for(int j=0; j<=n;j=j+1) { //별 배 시작
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
				} // 배 끝
			
			for(int j=0; j<=n;j=j+1) { //별  꼬리 시작
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
						for(int k=0;k<=n-1;k=k+1) {  //x로 덮는 부분
							tail[k][2*(n-1)+3]="   ";
							for(int l=1;l<=2*n-2*j-1;l=l+1) {
								tail[k][2*(n-1)+3-l]="   ";
								tail[k][2*(n-1)+3+l]="   ";
							}
							
						}	
						
					
						
						
					}
				} // 꼬리 끝
			
			
			for(int j=0; j<=n; j=j+1) {  //head출력
				for(int i=0; i<=4*n+2; i=i+1) {
					if(j<=n) {
					//System.out.print(head[j][i]);
						System.out.print(head[j][i]);
					}
			
				}
				System.out.println();
			}
			for(int j=0; j<=n; j=j+1) { //belly출력
				for(int i=0; i<=4*n+2; i=i+1) {
					if(j<=n) {
					//System.out.print(head[j][i]);
						System.out.print(belly[j][i]);
					}
			
				}
				System.out.println();
			}
			for(int j=n; j>=0; j=j-1) { //tail출력
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
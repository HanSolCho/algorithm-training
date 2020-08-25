import java.util.Random;
import java.util.Scanner;
//스도쿠라고 생각하면 될듯함
// 자바 공부 처음할때 만든코드라 for문과 if문이 많아 큰 숫자의 스도쿠는 실패 작은 숫자만 가능함
public class rdtable {
//0행,0열 먼저 선언 후 가지고 비교하기 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
			int n;
			
			
			Scanner sc = new Scanner(System.in);
			Random rd = new Random();
			
			System.out.println("nxn행렬, n을 입력하시오");
			n = sc.nextInt();
			int table[][]= new int[n][n];
			//int table2[][]= new int[n][n];
			
			for(int j=0;j<n;j=j+1) {   //세로 반복
				for(int i=0;i<n;i=i+1) {  //가로 반복
					if(i==0&&j==0) {// 0,0
						table[j][i]=rd.nextInt(n);
					//	table2[j][i]= table[j][i];
					}
					else if(j==0&&i!=0) {  //0,x
						table[j][i]=rd.nextInt(n);
						for(int b=0;b<i;b=b+1) {
							if(table[j][i]==table[j][b]) {
								System.out.println("중복1");
								i=i-1;
							}
						}
					}
					else if(j!=0&&i==0) { //x,0
						table[j][i]=rd.nextInt(n);
						for(int a=0;a<j;a=a+1) {
							if(table[j][i]==table[a][i]) {
								System.out.println("중복2");
								j=j-1;
							}
						}
					}
					else {
						table[j][i]=rd.nextInt(n);
						for(int a=0;a<j;a=a+1) {
								if(table[j][i]==table[a][i]) {
									System.out.println("중복3");
									j=j-1;
								}
							}
						}
						for(int b=0;b<i;b=b+1) {
							if(table[j][i]==table[j][b]) {
								System.out.println("중복4");
								i=i-1;
					}
					}
				
				}
			}
			
			
		/*for(int j=0;j<n;j=j+1) {   //세로 반복
			for(int i=0;i<n;i=i+1) {  //가로 반복
				table[j][i] = rd.nextInt(n);  //난수 넣기``
				if(j>0||i>0) { //j,i가 둘다 0일때 무한 루프 방지
				for(int q=0;q<j;q=q+1) { //table2세로
					for(int p=0;p<i;p=p+1) { // table2 가로
							if(table[j][i]==table2[q][p]) {
								System.out.println("중복"); //가로줄만체크
								i--;
						}
					}
				}
				}
				table2[j][i]= table[j][i];
			}
		}*/
		for(int j=0;j<n;j=j+1) {
			for(int i=0;i<n;i=i+1) {
				System.out.print(" "+table[j][i]+" ");
			}
			System.out.println();
		}
	}

}

import java.util.Random;
import java.util.Scanner;

public class rdtable {
//0��,0�� ���� ���� �� ������ ���ϱ� 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
			int n;
			
			
			Scanner sc = new Scanner(System.in);
			Random rd = new Random();
			
			System.out.println("nxn���, n�� �Է��Ͻÿ�");
			n = sc.nextInt();
			int table[][]= new int[n][n];
			//int table2[][]= new int[n][n];
			
			for(int j=0;j<n;j=j+1) {   //���� �ݺ�
				for(int i=0;i<n;i=i+1) {  //���� �ݺ�
					if(i==0&&j==0) {// 0,0
						table[j][i]=rd.nextInt(n);
					//	table2[j][i]= table[j][i];
					}
					else if(j==0&&i!=0) {  //0,x
						table[j][i]=rd.nextInt(n);
						for(int b=0;b<i;b=b+1) {
							if(table[j][i]==table[j][b]) {
								System.out.println("�ߺ�1");
								i=i-1;
							}
						}
					}
					else if(j!=0&&i==0) { //x,0
						table[j][i]=rd.nextInt(n);
						for(int a=0;a<j;a=a+1) {
							if(table[j][i]==table[a][i]) {
								System.out.println("�ߺ�2");
								j=j-1;
							}
						}
					}
					else {
						table[j][i]=rd.nextInt(n);
						for(int a=0;a<j;a=a+1) {
								if(table[j][i]==table[a][i]) {
									System.out.println("�ߺ�3");
									j=j-1;
								}
							}
						}
						for(int b=0;b<i;b=b+1) {
							if(table[j][i]==table[j][b]) {
								System.out.println("�ߺ�4");
								i=i-1;
					}
					}
				
				}
			}
			
			
		/*for(int j=0;j<n;j=j+1) {   //���� �ݺ�
			for(int i=0;i<n;i=i+1) {  //���� �ݺ�
				table[j][i] = rd.nextInt(n);  //���� �ֱ�``
				if(j>0||i>0) { //j,i�� �Ѵ� 0�϶� ���� ���� ����
				for(int q=0;q<j;q=q+1) { //table2����
					for(int p=0;p<i;p=p+1) { // table2 ����
							if(table[j][i]==table2[q][p]) {
								System.out.println("�ߺ�"); //�����ٸ�üũ
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

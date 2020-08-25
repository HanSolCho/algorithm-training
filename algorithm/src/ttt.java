import java.util.Scanner;

public class ttt {
	public static void main(String[] args) {

		int a,b,ab;
		int count = 0;
		String bi;
		String[] arr_bi;
		Scanner sc = new Scanner(System.in);		
		
		a = sc.nextInt();
		b = sc.nextInt();
		ab = a*b;
		
		bi = Integer.toBinaryString(ab);
		arr_bi = bi.split("");
	
		for(int i=0;i<arr_bi.length;i++) {
			
			if(arr_bi[i].equals("1")) {
				count = count+1;
			}
						
		}
		System.out.print(count);
		
	}
}
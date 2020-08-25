import java.util.Scanner;
//당시 간단한 코드라 생각해서 주석을 달아 놓지 않아 정확하지 않으나
// 알람시계를 구현한것으로 판단됨. 주석을 꼬박꼬박 달수 있도록 합시다!!
//코드를 추측컨데 현재 45분후 시간을 나타거나 하는 케이스같음
public class alertclock {

	 public static void main(String[] arg) 
	 { 
		 
		 int H,M;
		 Scanner sc = new Scanner(System.in);
		 H=sc.nextInt();
		 while(0>H||H>23) {
			 H=sc.nextInt();
		 }
		 M=sc.nextInt();
		 while(0>M||M>59) {
		 M=sc.nextInt();
		 }
		 
		 if(M-45<0) {
			 H=H-1;
			 M=M+15;
			 if(H==24) {
				 H=0;
			 }
			 else if(H<0) {
				 H=H+24;
			 }
		 }
		 else {
			 M=M-45;
		 }
		
		 
		 System.out.print(H+" "+M);
		
		 

		
		
	 } 
}

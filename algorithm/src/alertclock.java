import java.util.Scanner;

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

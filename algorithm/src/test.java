// 배열에있는거 더해서 똑같은 경우로 나누되 가장 큰경우
public class test {
	public static void main(String[] args) {
		
		  int answer = 0;
	      int A = 0,B=0; // 첫째,둘째의 과자 수
	  //    int pa=0; // answer과 비교하기 위한 변수
	      int ia =0; // 더하기 시작 위치 바꾸기 위한 변수
	      int []cookie = {1,1,2,3};
	        
	     while(true) {
	    	 
	    	 for(int i =ia; i<cookie.length-1;i++) { 
	    		 System.out.println("i의값"+i); 
	    		 A += cookie[i]; //a는 순차적으로 더해가면 값을 갖는다.
	    		 System.out.println("A의값"+A); 
	    		 for( int j=i+1;j<cookie.length-1;j++) {
	    			 B += cookie[j]; //b는 a이후의 값을 순차적으로 더해가며 값을 갖는다.
	    			 System.out.println("B의값"+B); 
	    			 
	    			 if(A==B) {
	    				 if(A>answer) {
	    				 answer = A;
	    				 System.out.println("pa의값"+answer); 
	    				 }
	    			 }
	    		 }
	    		 B=0;
	    	 }
	    	 ++ia;
	    	 A=0;
	    	 
	    	 if(ia>=cookie.length) {
	    		 break;
	    	 }
	     }
		
	}
}

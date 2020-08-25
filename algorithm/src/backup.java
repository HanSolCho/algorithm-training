import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class backup {
	public static void main(String[] args) {
		
		  int answer = 0;
	      int A = 0,B=0; // 첫째,둘째의 과자 수
	      int pa; // answer과 비교하기 위한 변수
	      int ia =0; // 더하기 시작 위치 바꾸기 위한 변수
	      int []cookie = {1,1,2,3};
	        
	     while(true) {
	    	 
	    	 for(int i =ia; i<cookie.length;i++) { 
	    		 System.out.println("i의값"+i); 
	    		 A = cookie[i]; //a는 순차적으로 더해가면 값을 갖는다.
	    		 System.out.println("A의값"+A); 
	    		 for( int j=i+1;j<cookie.length;j++) {
	    			 B += cookie[j]; //b는 a이후의 값을 순차적으로 더해가며 값을 갖는다.
	    			 System.out.println("B의값"+B);  
	    			 if(B>A) {
	    				 break;
	    			 }
	    			 
	    			 else if(B==A) {
	    				 
	    				 pa = A;
	    				 if(A>answer) {
	    	    			 answer = A;
	    	    			 System.out.println("중간체크" +answer);  
	    	    			 A = 0; //초기화
	    	    			 B = 0; //초기화
	    	    		 }
	    				 
	    			 }
	    			  
	    		 }
	    	
	    	 }
	    	 ia++;  // i의 for문이 다 돌고나면 ia값을 증가시킨 위치부터 다시돌아야댐
	    	 if(ia <= cookie.length) {
	    	 A = 0; //초기화
	    	 B = 0; //초기화
	    	 }
	    	 else {
	    		 break;
	    	 }
	     }
	    	System.out.println(answer);  
	    
		
	}
}


/*
		
		  int answer = 0;
	      int A = 0,B=0; // 첫째,둘째의 과자 수
	      int pa; // answer과 비교하기 위한 변수
	      int ia =0; // 더하기 시작 위치 바꾸기 위한 변수
	      int []cookie = {1,1,2,3};
	        
	     while(true) {
	    	 
	    	 for(int i =ia; i<cookie.length-1;i++) { 
	    		 System.out.println("i의값"+i); 
	    		 A += cookie[i]; //a는 순차적으로 더해가면 값을 갖는다.
	    		 System.out.println("A의값"+A); 
	    		 for( int j=i+1;j<cookie.length;j++) {
	    			 B += cookie[j]; //b는 a이후의 값을 순차적으로 더해가며 값을 갖는다.
	    			 System.out.println("B의값"+B);  
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
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class backup {
	public static void main(String[] args) {
		
		  int answer = 0;
	      int A = 0,B=0; // ù°,��°�� ���� ��
	      int pa; // answer�� ���ϱ� ���� ����
	      int ia =0; // ���ϱ� ���� ��ġ �ٲٱ� ���� ����
	      int []cookie = {1,1,2,3};
	        
	     while(true) {
	    	 
	    	 for(int i =ia; i<cookie.length;i++) { 
	    		 System.out.println("i�ǰ�"+i); 
	    		 A = cookie[i]; //a�� ���������� ���ذ��� ���� ���´�.
	    		 System.out.println("A�ǰ�"+A); 
	    		 for( int j=i+1;j<cookie.length;j++) {
	    			 B += cookie[j]; //b�� a������ ���� ���������� ���ذ��� ���� ���´�.
	    			 System.out.println("B�ǰ�"+B);  
	    			 if(B>A) {
	    				 break;
	    			 }
	    			 
	    			 else if(B==A) {
	    				 
	    				 pa = A;
	    				 if(A>answer) {
	    	    			 answer = A;
	    	    			 System.out.println("�߰�üũ" +answer);  
	    	    			 A = 0; //�ʱ�ȭ
	    	    			 B = 0; //�ʱ�ȭ
	    	    		 }
	    				 
	    			 }
	    			  
	    		 }
	    	
	    	 }
	    	 ia++;  // i�� for���� �� ������ ia���� ������Ų ��ġ���� �ٽõ��ƾߴ�
	    	 if(ia <= cookie.length) {
	    	 A = 0; //�ʱ�ȭ
	    	 B = 0; //�ʱ�ȭ
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
	      int A = 0,B=0; // ù°,��°�� ���� ��
	      int pa; // answer�� ���ϱ� ���� ����
	      int ia =0; // ���ϱ� ���� ��ġ �ٲٱ� ���� ����
	      int []cookie = {1,1,2,3};
	        
	     while(true) {
	    	 
	    	 for(int i =ia; i<cookie.length-1;i++) { 
	    		 System.out.println("i�ǰ�"+i); 
	    		 A += cookie[i]; //a�� ���������� ���ذ��� ���� ���´�.
	    		 System.out.println("A�ǰ�"+A); 
	    		 for( int j=i+1;j<cookie.length;j++) {
	    			 B += cookie[j]; //b�� a������ ���� ���������� ���ذ��� ���� ���´�.
	    			 System.out.println("B�ǰ�"+B);  
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

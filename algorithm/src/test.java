// �迭���ִ°� ���ؼ� �Ȱ��� ���� ������ ���� ū���
public class test {
	public static void main(String[] args) {
		
		  int answer = 0;
	      int A = 0,B=0; // ù°,��°�� ���� ��
	  //    int pa=0; // answer�� ���ϱ� ���� ����
	      int ia =0; // ���ϱ� ���� ��ġ �ٲٱ� ���� ����
	      int []cookie = {1,1,2,3};
	        
	     while(true) {
	    	 
	    	 for(int i =ia; i<cookie.length-1;i++) { 
	    		 System.out.println("i�ǰ�"+i); 
	    		 A += cookie[i]; //a�� ���������� ���ذ��� ���� ���´�.
	    		 System.out.println("A�ǰ�"+A); 
	    		 for( int j=i+1;j<cookie.length-1;j++) {
	    			 B += cookie[j]; //b�� a������ ���� ���������� ���ذ��� ���� ���´�.
	    			 System.out.println("B�ǰ�"+B); 
	    			 
	    			 if(A==B) {
	    				 if(A>answer) {
	    				 answer = A;
	    				 System.out.println("pa�ǰ�"+answer); 
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

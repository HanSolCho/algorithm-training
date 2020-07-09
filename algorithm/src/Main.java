import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int n;
		int fa =0;
		String bs;
		String[] sbs;
		int lineCnt=0;
		List<Integer> Count = new ArrayList<Integer>();
	    int fromIndex = -1;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		bs = Integer.toBinaryString(n);
		
		sbs = bs.split("1");
		
		
		
		//아이디어! -> 어차피 1과1사이값이 아니면 다 무의미 즉 마지막1이후의 0값은 1로 대체시켜보자
		//마지막 1의 인덱스값을 찾아서( 1의 인덱스값 다 찾아서 가장 큰거 쓰면되겠지
		//그 인덱스값보다 큰 배열값들은 전부 1로 변경
		
		for(int i=0;i<sbs.length;i++) {
			//1의 인덱스 위치값 저장할 배열 생성
		}
		//다시 포문으로 모든 범위 돌리고 1의 맥스 인덱스값 찾기 
		//내부에 이프문으로 1의 맥스 인덱스 값보다 큰경우 값 싹다 변경
		
		
		
		for(int i=0;i<sbs.length;i++) {
		
			
		//주석 쓰기
			// indexof("찾을 문자",어디서부터찾을건지->찾고나서 다음자리로 위치에서 찾기위해+1해주는것)
			// >=0의 경우 indexof 함수 결과값이 없을때 -1을 반환하기때문 즉 연속된 숫자가 끊김을 의미함
		    while ((fromIndex = sbs[i].indexOf("0", fromIndex + 1)) >= 0) {
		      lineCnt++;
		    }
			Count.add(lineCnt);
			lineCnt =0;
			System.out.println("s길이");
			 System.out.println(sbs.length);
		    System.out.println(sbs[i]);
		    System.out.println(Count.get(i));
		}
		 
		System.out.println("길이");
		System.out.println(Count.size());
		Count.add(1);
		
		for(int i=0;i<Count.size();i++) {		
			if(fa>=Count.get(i)) {
					
			}
			else {
				fa = Count.get(i);
			}
			
		}
		
		
		
		System.out.println(fa);
	}
}
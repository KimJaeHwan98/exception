	package exception;

import java.util.ArrayList;

public class Ex04 {	
		public static void main(String[] args) {
			try {
				int n1 = 10 , n2 = 2;
				System.out.println( n1 / n2 );
				
		ArrayList<String> arr = new ArrayList<>();
		arr.add("111"); //0
		arr.add("222"); //1
		arr.add("333"); //2
		for(int i=0 ; i<= arr.size() ; i++) {
			System.out.println(arr.get(i));
				}
			}catch(Exception e) {
				//System.out.println("문제 발생 : "+e);
			e.printStackTrace(); //현재 어떤 문제가 발생했는지 알려준다.
			
			}
			System.out.println("다음 문장들 이어서 진행!!!");
				
		}
	}


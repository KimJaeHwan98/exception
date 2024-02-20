	package exception;

import java.util.Scanner;

public class Ex05 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int x;
			System.out.println("수 입력");
			x = input.nextInt();
			
			try {
				int result = 10 / x;
				System.out.println("결과 : result" +result);
				return;
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				input.close();
				System.out.println("finally 실행");
			}
			System.out.println("다음 문장들 실행!!!");
				
			}
		}
// finally >> try,catch 뭐가 실행되도 finally가 작동한다.
// return으로 돌려받아도 finally는 무조건 실행한다.
//스트림들은 자원을 효율적으로 사용하기위해 닫아달라고 스케너에 느낌표가 생성된다.
// finally는 무조건 실행을 하기떄문에 마지막에 할 작업을 넣어준다.

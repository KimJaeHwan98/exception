package exception;

import java.util.Scanner;


public class Ex02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("수 입력");
			num = input.nextInt();
			try {
				System.out.println("결과 :" + (100/num) );
			}catch(Exception e) { //모든 클래스들은 부모 클래스로 처리가 가능하다.
				System.out.println("0입력하면 안되요!!");
				System.out.println(e);
				System.err.println( "에러 :"+ e ); //빨간글씨로 표시해준다
				
			}
		}
	}
}

//버그에 대한 상황을 발생시키면 다시 진행하라고 알려주고 프로그램은 꺼지면 안되기때문에 입력해줘야한다.
// 예외처리 장점 프로그램 종료를 막는다.
//코드가 꼭 있어야 하는건 아니다.
//그렇지만 catch에 문제가 왜 발생하는지 명확하게 적어줘야한다.
// 콘솔은 개발자가 확인하는거지만 사용자는 보는 화면이 아니기때문이다.
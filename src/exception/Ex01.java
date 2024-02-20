package exception;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int x,y, result = 0;
	System.out.println("수 입력");
	x = input.nextInt();
	y = input.nextInt();
	try {
		System.out.println("try실행");
		result= x / y; // 10을 0으로 나눌수 없다 라는 문제가 실행되면 / 문젝 생기지않으면 try모든 문장을 출력한다.
		System.out.println("정상 작동");
		System.out.println("정상 작동");
		System.out.println("정상 작동");
		
	}catch(ArithmeticException e){ // 캣치문 안에 내용들이 출력된다.
		System.out.println("문제 발생");
		System.out.println("0으로 나눌수 없음");
	}
	System.out.println("결과 :"+result);
	}	
}


//숫자를 입력하세요라고 했는데 문자를 입력하면 문제가 발생한다.
//0을 입력해도 오류가 발생한다
//이러한 예외 상황을 잡아주는 코드를 try catch문을 이용한다.
//
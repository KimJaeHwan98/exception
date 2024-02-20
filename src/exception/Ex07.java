package exception;

import java.util.Scanner;

//강제 예외
//코드로 문법적으로 문제가 발생하지않지만 개발자의 의도와 벗어난 경우
public class Ex07 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int age = 0;
	System.out.println("나이 입력");
	try {
		age = input.nextInt();
		if(age<0) {
			throw new Exception("음수는 안되요!!!");
		}
		
	}catch (Exception e) {
		//e.printStackTrace();
		System.out.println(e.getMessage());
		
	}
	
	System.out.println("당신의 나이는 : " + age);
}
}

	package exception;

import java.util.ArrayList;

public class Ex03 {
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
		}catch(IndexOutOfBoundsException e) {
			System.out.println("문제 발생 : "+e);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없음!!!"); //오버라이딩이 가능하다.
		}
		System.out.println("다음 문장들 이어서 진행!!!");
			
		}
	}

	
	//잘 모르겠을때 다 묶어도 상관은 없다.
	//문제 발생 후 다음문장을 진행시키고 싶으면 캣치 밖으로 문장을 빼주면 된다.
	//catch도 하나의 매소드이다.
	
//catch문장에는 문제발생 뒤 문장을 넣어준주고 변수를 입력한다.